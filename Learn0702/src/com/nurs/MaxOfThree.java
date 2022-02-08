package com.nurs;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,max;
		//take three integer from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three integer: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		/* calling get max function twice, 1. First call returns maximum
        * of a and b. let it be m. 2. Then second call return maximum of m and
        * c.*/
		max = getMax(getMax(a, b),c);
		
		System.out.println("The largest number: "+ max);
	}

	// returns the max of number a and number b
	private static int getMax(int a, int b) {
		// TODO Auto-generated method stub
		if (a > b) {
			return a;
		} else {
			return b;
	}

	
	}

}
