package com.simplilearn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
	
	@GetMapping("/")
	public String Hello()
	{
	  return "Hello!Welcome to Amazon EC2 Online Application.........";
	  }

}
