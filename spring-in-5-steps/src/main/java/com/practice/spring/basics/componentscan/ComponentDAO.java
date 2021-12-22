package com.practice.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {

	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public ComponentJdbcConnection getComponentJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	
	
}
