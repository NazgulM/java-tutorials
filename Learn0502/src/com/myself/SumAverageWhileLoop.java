package com.myself;

public class SumAverageWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int min = 1;
		int max = 100;
		int number = min;
		double average = 0;
		
		while (number <= max) {
			sum+= number;
			++number;
			System.out.println("Sum is: " + sum);
			
			average = sum/number;
			System.out.println("Average number is: " + average);
					
		}
		
	}

}
