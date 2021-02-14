package com.example.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ExampleService;

@RestController
public class ExampleController {
	
	@Autowired
	ExampleService exampleServiceImpl;
	
	@GetMapping("/get")
	public String getResult()
	{
		String result = exampleServiceImpl.getResult();
		return result;
	}

}
