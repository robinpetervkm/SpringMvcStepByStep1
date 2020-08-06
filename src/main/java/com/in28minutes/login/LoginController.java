package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	//set LoginService As A Bean
	@Autowired
	private LoginService loginService ;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginResquest(@RequestParam("name") String name,
			@RequestParam("password") String password, ModelMap model) {
		
		if (!loginService.validateUser(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		model.put("name1",name);
		return "welcome";
	}
}