package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/grocery")
public class grocery {
	@GetMapping("/groceryVal")
	public String groceryValv(@RequestParam(name="user",defaultValue = "guest")String user,Model model) {
	    System.out.println("sytem...");
		model.addAttribute("user", user);
		return "grocery-home";
	}
}
