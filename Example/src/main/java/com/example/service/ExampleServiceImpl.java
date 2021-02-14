package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

	@Override
	public String getResult() {
		
		return "Hello World";
	}

}
