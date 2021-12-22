package com.practice.springboot.aop.springbootaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
@Aspect
@Configuration
public class UserAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// Weaving & Weaver
	@Before(value = "execution(* com.practice.springboot.aop.springbootaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		// Advice
		logger.info("Check for User Access");
		logger.info("Allowed execution for {}",joinPoint.getSignature());
	}

}
