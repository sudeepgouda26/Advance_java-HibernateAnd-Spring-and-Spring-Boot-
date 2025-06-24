package com.jspiders.springwebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestHandler {
	@RequestMapping("/welcome")
	public String WelcomePage() {
		return "index.jsp";
				
	
	}
	@RequestMapping("/bye")
	public String ByePage() {
		
		return "bye.jsp";
				
	}
	@RequestMapping("/hello")
	public String HelloController(Model model) {
		model.addAttribute("message", "Hello, Spring MVC!");
		return "index.jsp";		
	}
	
	@RequestMapping("/home")
	public String Home(Model model) {
		model.addAttribute("greeting", "welcome to home page");
		return "home.jsp";
	}

}
