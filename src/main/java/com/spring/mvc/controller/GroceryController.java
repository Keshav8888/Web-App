package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grocery")
public class GroceryController {
	
	@GetMapping("/")
	public String greeting() {
	    System.out.println("WelcomeController.greeting()");
		return "grocery-home";
	}
}
