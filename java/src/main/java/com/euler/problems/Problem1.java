package com.euler.problems;

import java.util.ArrayList;

public class Problem1 {
	
	/*
	 * Problem 1: 
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 */
	
	private ArrayList<Integer> natural = new ArrayList<Integer>(1000);
	
	public Problem1() {
		//initialize the array
		for(int i = 1; i < 1000; i++) {
			natural.add(i);
		}
	}
	
	public int SumOf3or5() {
		int sum = 0;
		for(int i = 0; i < 1000; i++) {
			int current = natural.get(i);
			if(current % 3 == 0 || current % 5 == 0) {
				sum += current;
			}
		}
		return sum;
	}
}
