package com.example.frontendservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class FrontendserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontendserviceApplication.class, args);
	}




}
