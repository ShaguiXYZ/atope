/**
 * 
 */
package com.shagui.app.controlers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shagui.app.models.entity.Usuario;
import com.shagui.app.models.service.IUserService;

/**
 * @author Grego
 *
 */
@Controller
public class UserControler {
	
	@Autowired
	private IUserService service;

	/**
	 * @return
	 */
	@Secured("ROLE_USER")
	@RequestMapping(value= {"/", "/listaUsuarios"}, method=RequestMethod.GET)
	public String ListaUsusarios(Model model) {
		List<Usuario> users = service.findAll();
		
		model.addAttribute("users", users);
		
		return "/admin/listaUsuarios";
	}
	
	/**
	 * @param id
	 * @param model
	 * @return
	 */
	@Secured("ROLE_ADMIN")
	@RequestMapping(value="/formuser/{id}", method=RequestMethod.GET)
	public String editUser(@PathVariable(value="id") Long id, Model model) {
		Usuario user = service.findOne(id);
		model.addAttribute("user", user);
		
		return "/admin/editUser";
	}
	
	/**
	 * @param user
	 * @return
	 */
	@Secured("ROLE_ADMIN")
	@RequestMapping(value="/saveuser", method=RequestMethod.POST)
	public String saveUser(Usuario user) {
		service.save(user);
		
		return "/admin/listaUsuarios";
	}

}
