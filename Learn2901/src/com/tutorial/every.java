package com.tutorial;

import java.util.Scanner;

public class every {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i =1; i<=15; i++) {
			System.out.println(i);
		}
		// Print out Hi Nazgul 10 times using for loop
		int x;
		for (int x1= 0;x1<=10;x1++) {
			System.out.println("Hi Nazgul");
		}
		
		//to in put any operation have to import Scanner
		Scanner sc= new Scanner (System.in);
		char c;
		int v_int;
		float v_float;
		String str;
		//taking input from user
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		
		System.out.println("Enter a character: ");
		c =sc.next().charAt(0);
		
		System.out.println("Enter an integer: ");
		v_int = sc.nextInt();
		
		System.out.println("Enter a float: ");
		v_float = sc.nextFloat();
		
		
	}
}
