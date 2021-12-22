package com.practice.springboot.aop.springbootaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.springboot.aop.springbootaop.business.Business1;
import com.practice.springboot.aop.springbootaop.business.Business2;

@SpringBootApplication
public class SpringbootAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Business1 b1;
	
	@Autowired
	private Business2 b2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        
		logger.info(b1.performBusiness());
		logger.info(b2.performBusiness());
		
	}

}
