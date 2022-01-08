package com.thengara.loggingdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class LoggingDemoApplication {
	
	Logger logger = LoggerFactory.getLogger(LoggingDemoApplication.class);

	@Value("${server.port}")
	private int serverPort;
	

	public static void main(String[] args) {
		SpringApplication.run(LoggingDemoApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() throws UnknownHostException {
		logger.info("This is to inform that, application has been started");
		logger.debug("This is to inform that, debug level has been enabled");

		logger.info("http://"+InetAddress. getLocalHost().getHostName()+":"+serverPort+"/hello/");
	}

}
