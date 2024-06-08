package com.demo.model;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieCatalogService1Application {
	
	@Bean
	//@LoadBalanced
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		
		

		
		SpringApplication.run(MovieCatalogService1Application.class, args);
		
	}
	

}
