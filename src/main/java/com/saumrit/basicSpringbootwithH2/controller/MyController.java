package com.saumrit.basicSpringbootwithH2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@GetMapping("/welcome")
	public String getApploicationWelcome() {
		return "Welcome to My springBoot Application";
	}
}
