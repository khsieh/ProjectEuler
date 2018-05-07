package com.euler.problems;

/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem4 {
	static final int start = 999;
	static final int lowerBound = 100;
	private static boolean isPalidrome(String s) {
	    
	    int half = s.length()/2;
	    int j = s.length() -1;
	    for(int i = 0; i < half; i++, j--) {
			if(s.charAt(i) != s.charAt(j)) {
			    return false;
			}
	    }
	    return true;
	}

    public static int largestPalidrome(){
    	int maxPalindrome = 0;
        for(int i = start; i >= 0 && i >= lowerBound; i--) {
            for(int j = start; j >= 0 && j >= lowerBound; j--) {
            	int answer = i*j;               
            	if( isPalidrome(Integer.toString(answer)) ) {
                	if(answer > maxPalindrome) {
                		System.out.println("factors: " + i + ", " + j);
                		maxPalindrome = answer;
                	}
                		
                }
            }
        }
        return maxPalindrome;
    }
	    
	public static void main(String[] args){
		System.out.println(largestPalidrome());
	}

}
