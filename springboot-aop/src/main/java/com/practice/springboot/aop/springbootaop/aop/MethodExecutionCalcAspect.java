package com.practice.springboot.aop.springbootaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
@Aspect
@Configuration
public class MethodExecutionCalcAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// Weaving & Weaver
	@Around(value = "execution(* com.practice.springboot.aop.springbootaop.business.*.*(..))")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		// Advice 
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time Taken by {} is {} ",joinPoint, timeTaken);
	}

}
