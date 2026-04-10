package com.vinam.edunotes_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/hello")
	public String display() {
		return "We are live now Vinam!";
	}
	
}
