package com.euler;

import com.euler.problems.Problem1;
import com.euler.problems.Problem2;

public class Main {
	
	
	//main class used as playground to test each problem.
	//Goal is to write a unit tester method for each problem
	public static void main(String[] args) {
		Problem1 p1 = new Problem1();
		System.out.println(p1.SumOf3or5());
		
		Problem2 p2 = new Problem2();
		System.out.println(p2.sumOfEvens());
	}

}
