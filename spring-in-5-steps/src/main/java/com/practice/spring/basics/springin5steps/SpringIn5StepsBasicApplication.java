package com.practice.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.practice.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		// BinarySearchImpl bs = new BinarySearchImpl(new BubbleSortAlgorithm());
		// com.practice.spring.basics.springin5steps.BubbleSortAlgorithm@15db9742
		
		//BinarySearchImpl bs = new BinarySearchImpl(new QuickSortAlgorithm());
		// com.practice.spring.basics.springin5steps.QuickSortAlgorithm@15db9742
		
		BinarySearchImpl bs = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl bs1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(bs);
		System.out.println(bs1);
		int result = bs.binarySearch(new int[] {21,12,3}, 3);
		System.out.println(result);
		//System.out.println("Success");
	}

}
