package com.dcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class demoController {
	
	@GetMapping("/demo")
	public String demo(Model model) {
		model.addAttribute("message", "welcome to webmvc");
		return "index";
	}

}
