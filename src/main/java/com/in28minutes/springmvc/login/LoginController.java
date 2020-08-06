package com.in28minutes.springmvc.login;

import org.springframework.stereotype.Controller;
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
	public String handleLoginResquest(@RequestParam("name") String name) {
		System.out.println("NAME --- > "+name);
		return "welcome";
	}
}