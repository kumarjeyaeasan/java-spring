package com.practice.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		// Implement Bubble sort logic & return result
		return numbers;
	}
	
}
