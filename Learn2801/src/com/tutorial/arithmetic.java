package com.tutorial;

public class arithmetic {

	static int lowerbound = 9;
	static int upperbound = 899;
	static int sum = 0;
	static int number = lowerbound;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (number <= upperbound) {

		sum = sum + number;
		++number;
	}
		System.out.println(" The sum from " + lowerbound + " to " + upperbound + " is " + sum);


}
}
