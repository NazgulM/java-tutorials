package com.aruuke;

import java.util.Scanner;

public class FindLowValuesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan  = new Scanner(System.in);
		final String ASK_INPUT  = "Fill a number please: ";
		
		System.out.println(ASK_INPUT);
		int firstNumber = scan.nextInt();
		System.out.println("First number is: " + firstNumber);
		
		System.out.println(ASK_INPUT);
        int secondNumber = scan.nextInt();
        System.out.println("Second number is: " + secondNumber);

        int lowestValue = findLowestValue(firstNumber, secondNumber);
        System.out.println("The lowest value is: " + lowestValue);
	}

	private static int findLowestValue(int firstNumber, int secondNumber) {
		// TODO Auto-generated method stub
		//        return (firstNumber > secondNumber) ? secondNumber : firstNumber;
		return Math.min(firstNumber, secondNumber);
	}

}
