/**
 * 
 */
package com.shagui.app.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Shagui
 *
 */
@Controller
public class InitControler {

	@GetMapping(value="/")
	public String init(Model model) {
		model.addAttribute("titulo", "Página de inicio!!!... ");
		
		return "blank";
	}
}
