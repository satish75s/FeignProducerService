package com.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/feignproducer")
@RestController
public class ProducerController {
	
	@GetMapping("/callingproducer")
	public String getGreeting() {
		
		return " producer service has been called from feign client.\n "
				+ "no additional changes required in producer service to handle feign call.\n take care the following in feign client \n "
				+ "1. add dependency named 'spring-cloud-starter-openfeign' \n "
				+ "2. add @EnableFeignClients  in Spring Boot Application \n "
				+ "3. create Producer client Interface";
	}

}
