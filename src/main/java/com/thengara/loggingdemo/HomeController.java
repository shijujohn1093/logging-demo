package com.thengara.loggingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@GetMapping("/hello")
	public String hello() {
		logger.info("hello world !!");

		return "Hello There !!";
	}
}
