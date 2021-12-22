package com.practice.springboot.basics.springbootpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
public class BooksController {
	
	/*
	 http://localhost:8080/explorer/index.html#uri=/actuator
	 */
	
	@GetMapping(value="/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(
				new Book(1l,"Test","Senthil"));
	}

}
