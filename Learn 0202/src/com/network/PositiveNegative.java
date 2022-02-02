package com.network;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		
		//user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		num = scanner.nextInt();
		
		//using if else statement for check number whether or not negative
		if (num>=0) {
			// num is positive
			System.out.println(num+ " is positive number");
		} else {
			System.out.println(num+ " is negative number");
		}
	}

}
;