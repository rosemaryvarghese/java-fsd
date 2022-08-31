package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.service.AppService;

@Controller
public class FeedbackController {
	
	@Autowired
	private AppService appService;
	
	@GetMapping("/feedback")
	public String feedback() {
		return "feedback";
	}
}
