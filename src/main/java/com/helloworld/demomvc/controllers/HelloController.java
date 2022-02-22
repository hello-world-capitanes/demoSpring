package com.helloworld.demomvc.controllers;

import com.helloworld.demomvc.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private GreetingService servicio;

	@GetMapping("/")
	public String index() {
		return servicio.getHello();
	}

}