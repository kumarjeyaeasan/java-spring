package com.practice.springboot.aop.springbootaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
@Aspect
@Configuration
public class AfterAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// Weaving & Weaver
	@AfterReturning(
			value = "execution(* com.practice.springboot.aop.springbootaop.business.*.*(..))",
			returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		// Advice 
		logger.info("{} returned with value {} ",joinPoint, result);
	}

	@AfterThrowing(
			value = "execution(* com.practice.springboot.aop.springbootaop.business.*.*(..))",
			throwing="exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		// Advice 
		logger.info("{} throws the exception {} ",joinPoint, exception);
	}
	
	@After("execution(* com.practice.springboot.aop.springbootaop.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		// Advice 
		logger.info("After the execution of {}",joinPoint);
	}
}
