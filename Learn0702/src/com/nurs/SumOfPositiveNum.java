package com.nurs;

import java.util.Scanner;

public class SumOfPositiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		Scanner scan = new Scanner(System.in);// create an object of Scanner class
		
		//take integer input from user
		System.out.println("Enter a number");
		int number = scan.nextInt();
		// while loop cont until entered the positive num
		while (number>=0) {
			sum+=number;
			
			System.out.println("Enter a number");
			number = scan.nextInt();
		}
		System.out.println("The sum is: " + +sum);
		scan.close();
	}
  /* The while loop continues until the user enters a negative number. 
   * During each iteration, the number entered by the user is added to the sum variable.
   */
}
