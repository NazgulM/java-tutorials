package com.study;

public class Oddevensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min = 1;
		int max = 1000;
		int sumOdd  = 0; //for accumulating odd numbers int = 0
		int sumEven = 0; // for accum. even numbers init to 0
		int num  = min;
		while(num <= max) {
			if(num%2 == 0) { // even numbers
				sumEven+=num; //same as sumEven = sumEven +number
			} else {
				sumOdd+= num; //sumOdd = sumOdd+number
			}
			++num; // next number
		}
		System.out.println("The sum of Even numbers: " +sumEven);
		System.out.println("The sum of Odd numbers: " + sumOdd);
		System.out.println(" The difference of two sums is: " + (sumOdd-sumEven));
	}

}
