/**
 * 
 */
package com.shagui.app.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shagui.app.models.entity.Persona;
import com.shagui.app.models.service.IPersonaService;
import com.shagui.app.resources.Ctes;

/**
 * @author gromera
 *
 */
@Secured(Ctes.ROLES.USER)
@Controller
public class PersonaControler {
	
	@Autowired
	IPersonaService service;

	/**
	 * @return
	 */
	@RequestMapping(value= {"/", "/listaPersonas"}, method=RequestMethod.GET)
	public String ListaPersonas(Model model) {
		List<Persona> personas = service.findAll();
		
		model.addAttribute("personas", personas);
		
		return "/listaPersonas";
	}
	
	/**
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/formpersona/{id}", method=RequestMethod.GET)
	public String editPersona(@PathVariable(value="id") Long id, Model model) {
		Persona persona = service.findOne(id);
		model.addAttribute("persona", persona);
		
		return "/editPersona";
	}
	
	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/savepersona", method=RequestMethod.POST)
	public String saveUser(Persona persona) {
		service.save(persona);
		
		return "/listaPersonas";
	}

}
