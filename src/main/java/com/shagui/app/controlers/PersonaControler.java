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
 * @author Shagui
 *
 */
@Controller
public class PersonaControler {
	
	@Autowired
	IPersonaService service;

	/**
	 * @return
	 */
	@Secured(Ctes.ROLES.USER)
	@RequestMapping(value= {"/", "/personas"}, method=RequestMethod.GET)
	public String listaPersonas(Model model) {
		List<Persona> personas = service.findAll();
		
		model.addAttribute("personas", personas);
		
		return "/personas/list";
	}
	
	/**
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/formpersona", method=RequestMethod.GET)
	public String newUser(Model model) {
		Persona persona = new Persona();
		model.addAttribute("persona", persona);
		
		return "/personas/edit";
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
		
		return "/personas/edit";
	}
	
	/**
	 * @param id
	 * @param model
	 * @return
	 */
	@Secured(Ctes.ROLES.ADMIN)
	@RequestMapping(value="/deletepersona/{id}", method=RequestMethod.GET)
	public String deletePersona(@PathVariable(value="id") Long id, Model model) {
		service.delete(id);
		
		return "/personas/list";
	}
	
	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/savepersona", method=RequestMethod.POST)
	public String savePersona(Persona persona) {
		service.save(persona);
		
		return "/personas/list";
	}

}
