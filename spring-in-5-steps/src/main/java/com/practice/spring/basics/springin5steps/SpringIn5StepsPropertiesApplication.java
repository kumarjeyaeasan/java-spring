package com.practice.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.practice.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.practice.spring.basics.springin5steps.properties.ExternalService;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsPropertiesApplication.class, args);
		
	
		ExternalService externalService = applicationContext.getBean(ExternalService.class);
		
		System.out.println(externalService.returnServiceURL());
	}

}
