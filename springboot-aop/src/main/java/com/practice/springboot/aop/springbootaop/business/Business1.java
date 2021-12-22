package com.practice.springboot.aop.springbootaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.springboot.aop.springbootaop.data.Dao1;

@Service
public class Business1 {
	
	@Autowired
	private Dao1 dao1;
	
	public String performBusiness() {
		return dao1.retreiveDao1Data();
	}

}
