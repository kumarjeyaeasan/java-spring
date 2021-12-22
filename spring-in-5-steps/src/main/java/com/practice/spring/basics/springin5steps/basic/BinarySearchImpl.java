package com.practice.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	// Autowiring by constructor injection
	/*
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	*/
	
	// Autowiring by setter injection
	/*
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	*/
	public int binarySearch(int [] numbers, int search) {
		
		// sort the array
		// BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
		int [] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// search the array
		
		
		// return the result
		return 3;
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
		
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
		
	}
	
}
