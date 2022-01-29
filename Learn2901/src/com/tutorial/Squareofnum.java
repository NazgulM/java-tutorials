package com.tutorial;

public class Squareofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prod; 
	    int sum; 
	    int i; 
	 
	    sum = 0; 
	    prod = 1; 
	 
	    for(i=1; i <= 10; i++) { 
	      sum = sum + i; 
	      prod = prod * i;       
	    } 
	    System.out.println("Sum is " + sum); 
	    System.out.println("Product is " + prod); 
	}

}
