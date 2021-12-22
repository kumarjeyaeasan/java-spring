package com.practice.spring.database.databasepractice;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.spring.database.databasepractice.entity.Person;
import com.practice.spring.database.databasepractice.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataPracticeApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("By ID (10001) -> {}",repo.findById(10001));
		logger.info("Insert {}",repo.save(new Person("Ramya","Bangalore",new Date())));
		logger.info("Update {}",repo.save(new Person(10003,"Pieter","Hyd",new Date())));
		repo.deleteById(10002);
		logger.info("All Users -> {}",repo.findAll());
	}


}
