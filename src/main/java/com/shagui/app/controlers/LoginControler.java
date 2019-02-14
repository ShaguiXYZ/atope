/**
 * 
 */
package com.shagui.app.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shagui.app.models.entity.User;
import com.shagui.app.models.service.IUserService;

/**
 * @author Grego
 *
 */
@Controller
public class LoginControler {
	@Value("${application.controller.login}")
	private String titulo;
	
	@Autowired
	private IUserService service;
	
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("titulo", titulo);
		model.addAttribute("user", new User());
		
		return "login";
	}
	
	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticator(User user) {
		User uLogin = service.findOne(user.getUid());
		
		if (uLogin != null && uLogin.getId() >= 0) {
			return "redirect:listaUsuarios";
		}
		
		return "login";
	}
}
