package com.practice.spring.database.databasepractice.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.spring.database.databasepractice.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer>{

}
