package com.practice.FeBe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {

	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
}
