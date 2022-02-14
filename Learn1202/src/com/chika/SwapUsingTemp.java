package com.chika;

import java.util.Scanner;

public class SwapUsingTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first integer (A): ");
		a= scan.nextInt();
		System.out.println("Second integer(b): ");
		b= scan.nextInt();
		
		//swapping two numbers using int temp
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping");
		System.out.println("A = " + a + "\nB = " + b);
		
	}

}
