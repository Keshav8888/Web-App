package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/footwear")
public class FootWearController {

	@GetMapping("/")
	public String greeting() {
		System.out.println("WelcomeController.greeting()");
		return "footwear-home";
	}
	
	@GetMapping("/query")
	public String queryParam(@RequestParam(name = "name",defaultValue = "Guest") String user, Model model) {
		
		model.addAttribute("user",user);
		System.out.println("WelcomeController.queryParam: "+user);
		
		return "success";
	}
	
}
