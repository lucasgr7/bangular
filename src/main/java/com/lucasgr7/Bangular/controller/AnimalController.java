package com.lucasgr7.Bangular.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
	
	@RequestMapping(path="/animal")
	public String getDog() {
		return "Dog: woof!";
	}
}
