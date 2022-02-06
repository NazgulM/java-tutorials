package com.myself;

public class SumOfSqFor {

	public SumOfSqFor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		int sum = 0;
		
		//calculating squares from 1 to 100 using for loop
		for (int i = 1; i <= num; i++) {
			sum+=i*i;
			
			System.out.println("Sum is " + sum);
		}
	}

}
