package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class JspController {

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("msg","Spring Boot 集成 jsp");
		return "index";
	}
}
