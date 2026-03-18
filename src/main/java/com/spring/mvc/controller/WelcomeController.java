package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	//@RequestMapping(value = "/login", method = RequestMethod.GET)
	@GetMapping("/")
	public String greeting() {
		System.out.println("WelcomeController.greeting()");
		return "index";
	}
	
	@GetMapping("/sign-up")
	public String createUser() {
		System.out.println("WelcomeController.greeting()");
		return "form";
	}
	
	@PostMapping("/postForm")
	public String postUser(@RequestParam(name="username")String username,@RequestParam(name="department")String department,@RequestParam(name="address")String address,Model model) {
		System.out.println("WelcomeController.greeting()");
		model.addAttribute("username",username);
		model.addAttribute("department",department);
		model.addAttribute("address",address);
		return "showData";
	}
	
	
}
