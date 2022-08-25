package com.bourntec.sampleProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleProjectController {

	@GetMapping("/")
	public String message() {
		return "Welcome to spring boot";
		
	}
}
