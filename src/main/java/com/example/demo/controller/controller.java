package com.example.demo.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@RequestMapping("/test")
	@ResponseBody
	
	public String name() {
		return "Welcome to shop toys";
	}

}
