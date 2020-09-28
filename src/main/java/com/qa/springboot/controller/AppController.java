package com.qa.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/appController")
@RestController
public class AppController {
	@RequestMapping("/test1")
	public Object test1(){
		return "success";
	}
}
