package com.qa.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/bb")
@RestController
public class Bb {
	@RequestMapping("/b1")
	public Object b1(){
		return "bb";
	}
}
