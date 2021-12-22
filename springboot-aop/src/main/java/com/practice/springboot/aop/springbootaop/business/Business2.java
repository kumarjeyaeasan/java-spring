package com.practice.springboot.aop.springbootaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.springboot.aop.springbootaop.data.Dao2;

@Service
public class Business2 {
	
	@Autowired
	private Dao2 dao2;
	
	public String performBusiness() {
		return dao2.retreiveDao2Data();
	}

}
