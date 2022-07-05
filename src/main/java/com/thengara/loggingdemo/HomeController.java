package com.thengara.loggingdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/loggingctrl")
public class HomeController {
	
	
	@GetMapping("/hello")
	public String hello() {
		log.info("hello world !!");
		return "Hello There !!";
	}
}
