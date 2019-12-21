package com.springboot.security.demo.service.impl;

import com.springboot.security.demo.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String greeting(String name) {
		System.out.println("greeting");
		return "hello "+name;
	}

}
