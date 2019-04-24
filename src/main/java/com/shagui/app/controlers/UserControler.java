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

import com.shagui.app.models.entity.Usuario;
import com.shagui.app.models.service.IUserService;
import com.shagui.app.resources.Ctes;

/**
 * @author Grego
 *
 */
@Secured(Ctes.ROLES.ADMIN)
@Controller
public class UserControler {
	
	@Autowired
	private IUserService service;

	/**
	 * @return
	 */
	@RequestMapping(value= {"usuarios"}, method=RequestMethod.GET)
	public String ListaUsusarios(Model model) {
		List<Usuario> users = service.findAll();
		model.addAttribute("users", users);
		
		return "/users/list";
	}
	
	/**
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/formuser", method=RequestMethod.GET)
	public String newUser(Model model) {
		Usuario user = new Usuario();
		model.addAttribute("user", user);
		
		return "/users/edit";
	}
	
	/**
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/formuser/{id}", method=RequestMethod.GET)
	public String editUser(@PathVariable(value="id") Long id, Model model) {
		Usuario user = service.findOne(id);
		model.addAttribute("user", user);
		
		return "/users/edit";
	}
	
	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/saveuser", method=RequestMethod.POST)
	public String saveUser(Usuario user) {
		service.save(user);
		
		return "/users/list";
	}
	
	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/canceluser", method=RequestMethod.GET)
	public String cancelUser() {
		return "/users/list";
	}
	
	/**
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/deleteuser/{id}", method=RequestMethod.GET)
	public String deleteUser(@PathVariable(value="id") Long id, Model model) {
		service.delete(id);
		
		return "/users/list";
	}

}
