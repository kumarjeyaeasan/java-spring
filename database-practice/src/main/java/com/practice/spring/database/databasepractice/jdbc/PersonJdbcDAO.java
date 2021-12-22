package com.practice.spring.database.databasepractice.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.practice.spring.database.databasepractice.entity.Person;

@Repository
public class PersonJdbcDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

			Person person = new Person();
			
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirthDate(rs.getTimestamp("birth_date"));
			
			return person;
		}
		
	}
	
	public List<Person> findAll(){
		//  return jdbcTemplate.query("select * from person",new BeanPropertyRowMapper(Person.class));
		return jdbcTemplate.query("select * from person",new PersonRowMapper());
	}
	
	public Person findById(int id){
		
		/* return jdbcTemplate.queryForObject("select * from person where id=?", new Object [] {id}, new int [] {1},
				new BeanPropertyRowMapper<Person>(Person.class));*/
		
		return jdbcTemplate.queryForObject("select * from person where id=?",
				new BeanPropertyRowMapper<Person>(Person.class),id);
	}

	public List<Person> findByName(String name){
		
		return jdbcTemplate.query("select * from person where name=?",
				new BeanPropertyRowMapper<Person>(Person.class),name);
	}
	
	public List<Person> findByLocation(String location){
		
		return jdbcTemplate.query("select * from person where location=?",
				new BeanPropertyRowMapper<Person>(Person.class),location);
	}
	
	public int deleteById(int id){
		
		return jdbcTemplate.update("delete from person where id=?",id);
	}
	
	public int insert(Person person){
		
		return jdbcTemplate.update("insert into person (id, name, location, birth_date )" 
				+ "	values(?, ?, ?, ?)",
				new Object[] {
						person.getId(),
						person.getName(),
						person.getLocation(),
						new Timestamp(person.getBirthDate().getTime())});
	}
	
	public int update(Person person){
		
		return jdbcTemplate.update("update person "
				+ " set name=?, location=?, birth_date=? "
				+ " where id =?", 
				new Object[] {
						person.getName(),
						person.getLocation(),
						new Timestamp(person.getBirthDate().getTime()),
						person.getId()});
	}
}
