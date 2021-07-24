package com.keytech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/add")
	public String add() {
		System.out.println("hy");
		return "hello";
	}
	
}
