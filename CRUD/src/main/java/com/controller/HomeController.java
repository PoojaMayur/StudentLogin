package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping("/")
	public String Start()
	{
		System.out.println("In start");
		return "Login";
		
	}
	
	@RequestMapping("/registerpage")
	public String RegisterPage()
	{
		System.out.println("In register");
		return "Register";
	}
	
	
}
