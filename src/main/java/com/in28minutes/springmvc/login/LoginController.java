package com.in28minutes.springmvc.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginResquest(@RequestParam("name") String name,
			@RequestParam("password") String password, ModelMap model) {
		model.put("name1", name);
		model.put("password1", password);
		return "welcome";
	}
}