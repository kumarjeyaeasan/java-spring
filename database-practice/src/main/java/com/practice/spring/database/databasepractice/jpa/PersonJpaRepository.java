package com.practice.spring.database.databasepractice.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.practice.spring.database.databasepractice.entity.Person;

@Transactional
@Repository
public class PersonJpaRepository {

	
	@PersistenceContext
	EntityManager entityManager;
	
	// Search
	public Person findById(int id){
		return entityManager.find(Person.class, id);
	}
	
	// Insert/Update
	public Person update(Person person){
		return entityManager.merge(person);
	}
	
	// Insert/Update
	public void deleteById(int id){
		Person personDel=findById(id);
		entityManager.remove(personDel);
	}
	
	public List<Person> findAll(){
		
		TypedQuery<Person> namedQuery =  entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
		
	}
	

}
