package com.naza;

import java.util.Scanner;

public class OpdractIsEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		System.out.println(isEven(number));
				
	}

	private static boolean isEven(int number) {
		// TODO Auto-generated method stub
		return (number%2 ==0);
	}

}
