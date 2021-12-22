package com.practice.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
		proxyMode = ScopedProxyMode.TARGET_CLASS)

public class JdbcConnection {
	@Autowired
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}
	
	
}
