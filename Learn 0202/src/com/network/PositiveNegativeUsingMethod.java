package com.network;

import java.util.Scanner;

public class PositiveNegativeUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         int num = 0;
		
		//user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		num = scanner.nextInt();
		
		// calling isPositive method to check number whether positive or negative
		if(isPositive(num)) {
			//num is positive
			System.out.println(num + " is positive number");
		} else {
			//num is negative
			System.out.println(num + " is negative number");
		}
		
	}

	private static boolean isPositive(int num) {
		// TODO Auto-generated method stub
		if(num>=0)
		return true;
		else
		return false;
	}

}
