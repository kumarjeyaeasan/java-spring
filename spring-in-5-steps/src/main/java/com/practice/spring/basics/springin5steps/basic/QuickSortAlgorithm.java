package com.practice.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		// Implement Quick sort logic & return result
		return numbers;
	}
	
}
