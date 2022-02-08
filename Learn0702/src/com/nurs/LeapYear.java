package com.nurs;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int year  = 2022;
		if(((year%4 == 0) &&(year /100  != 0)|| (year/400 ==0))) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Common Year");*/
		
		
		// If- Else ternary example
		int number = 24;
		// Using ternary operator
		String output = (number%2==0)?"even number":"odd number";
		System.out.println(output);
		}
	}


