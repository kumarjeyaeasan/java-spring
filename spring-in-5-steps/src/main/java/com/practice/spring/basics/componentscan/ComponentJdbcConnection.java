package com.practice.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
		proxyMode = ScopedProxyMode.TARGET_CLASS)

public class ComponentJdbcConnection {
	@Autowired
	public ComponentJdbcConnection() {
		System.out.println("JDBC Connection");
	}
	
	
}
