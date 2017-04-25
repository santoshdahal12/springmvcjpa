package com.packt.webstore.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
  
@RestController
public class HomeController {


	@RequestMapping("/")
	public String welcome(Model model) {
		
		model.addAttribute("greeting", "Welcome to our community, Kimosabe!!");
		model.addAttribute("tagline", "The one and only pace to live, work and play!!");
		
		return "welcome";
	}
 
}
