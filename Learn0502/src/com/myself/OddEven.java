package com.myself;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		int sumOdd = 0;
		int sumEven = 0;
		int absDiff = 0;
		
		
		for (int i = 1; i <= num;i++  ) {
			if (i%2 ==0) {
				sumEven = sumEven+i;
				
			} else {
				sumOdd = sumOdd+i;
			}	
		}
		System.out.println("Sum of even numbers: " +sumEven);
		System.out.println("\n The sum of Odd numbers: " + sumOdd);
		
		
		// compute absolute difference
	    if (sumOdd > sumEven) {
	  	  absDiff = sumOdd - sumEven;
	    } else {
	    	absDiff  = sumEven - sumOdd;
	    	System.out.println("The absolute difference between two sums is: " + absDiff);
	}
	
{

    
      }
}
}