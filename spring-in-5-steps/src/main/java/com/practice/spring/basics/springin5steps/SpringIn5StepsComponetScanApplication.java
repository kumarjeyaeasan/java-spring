package com.practice.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.practice.spring.basics.componentscan.ComponentDAO;
import com.practice.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.practice.spring.basics.componentscan")
public class SpringIn5StepsComponetScanApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsComponetScanApplication.class); 
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsComponetScanApplication.class, args);
		
		
		ComponentDAO componetDAO = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}",componetDAO);
		
		
	}

}
