package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/electronics")

public class electronics {
	@GetMapping("/electronicVal")
 public String electronicVal(@RequestParam(name="user",defaultValue="unknow")String user,Model model) {
		System.out.println("electronics.electronicVal()");
		model.addAttribute("user",user);
		System.out.println("name : "+user);
	   return "electronic-home";
 }
	
}
