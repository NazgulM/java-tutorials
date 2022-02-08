package com.nurs;

public class SumOfArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {4,8,6,-5,12};
		int sum = 0;
		
		// Iterating through the numbers
		for (int number: numbers) {
			sum += number;
		}
			System.out.println("Sum = " + sum);
		}
	}
      /* first number = 4: 0+4=4;
       * second number  = 8: 4+8 = 12;
       * third number =  6: 12+6=18;
       * fourth -5: 18+(-5) = 13
       * Fifth = 12: 13+12 = 25
       */

