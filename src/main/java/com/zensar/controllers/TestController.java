package com.zensar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	// http://localhost:8080/
	@GetMapping("/")
	public String test() {
		return "<h2> Welcome to SPring Boot/Docker </h2>";
	}

}
