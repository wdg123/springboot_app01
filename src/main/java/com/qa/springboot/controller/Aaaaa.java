package com.qa.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/aaa")
@RestController
public class Aaaaa {
	@RequestMapping("/a1")
	public Object test1(){
		return "aaaaa";
	}
}
