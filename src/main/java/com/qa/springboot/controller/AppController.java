package com.qa.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/appController")
@RestController
public class AppController {
	@RequestMapping("/test1")
	public Object test1(){
		return "success";
	}
	
	@RequestMapping("/test2")
	public Object test2(){
		Map<String, Object> map = new HashMap<String, Object>();
		int[] arr = new int[Integer.MAX_VALUE/10];
		for(int i = 0;i<Integer.MAX_VALUE/10;i++){
			arr[i] = i;
		}
		map.put("arr", arr);
		return map;
	}
}
