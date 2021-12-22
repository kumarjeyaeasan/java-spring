package com.practice.spring.database.databasepractice;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.spring.database.databasepractice.entity.Person;
import com.practice.spring.database.databasepractice.jdbc.PersonJdbcDAO;

//@SpringBootApplication
public class SpringJdbcPracticeApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO personJdbcDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All Users -> {}",personJdbcDao.findAll());
		logger.info("By ID (1001) -> {}",personJdbcDao.findById(10001));
		logger.info("By Name (Senthil) -> {}",personJdbcDao.findByName("Senthil"));
		logger.info("By Location (Bangalore) -> {}",personJdbcDao.findByLocation("Bangalore"));
		//logger.info("Delete By ID (10002). Number of rows affected {}",personJdbcDao.deleteById(10002));
		logger.info("Insert 10004 -> {}",personJdbcDao.insert(new Person(10004,"Ramya","Bangalore",new Date())));
		logger.info("Update 10003 -> {}",personJdbcDao.update(new Person(10003,"Pieter","Hyd",new Date())));
	}


}
