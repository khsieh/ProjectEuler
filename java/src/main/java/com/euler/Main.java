package com.euler;

import com.euler.problems.Problem1;
import com.euler.problems.Problem2;
import com.euler.problems.Problem4;

public class Main {
	
	
	//main class used as playground to test each problem.
	//Goal is to write a unit tester method for each problem
	public static void main(String[] args) {
		
		//problem 1
		Problem1 p1 = new Problem1();
		System.out.println(p1.SumOf3or5());
		
		//problem 2
		Problem2 p2 = new Problem2();
		System.out.println(p2.sumOfEvens());
		
		//problem 3
		
		
		//problem 4
		System.out.println(Problem4.largestPalidrome());
	}

}
