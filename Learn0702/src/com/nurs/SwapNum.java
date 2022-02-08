package com.nurs;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		a = scan.nextInt();
		System.out.println("Enter second integer: ");
		b = scan.nextInt();
		//swapping a and b
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping");
		System.out.println("A = " + a + "\nB = " + b);
		
	}

}
