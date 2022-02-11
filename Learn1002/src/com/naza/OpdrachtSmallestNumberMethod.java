package com.naza;

import java.util.Scanner;

public class OpdrachtSmallestNumberMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Input the first number: ");
		double a = scan.nextDouble();
		System.out.println("The second number: ");
		double b = scan.nextDouble();
		System.out.println("The third number is: ");
		double c = scan.nextDouble();
		System.out.println("The smallest value is: " + smallest(a,b,c) + "\n");
		System.out.println("The average value is: " + average(a,b,c) + "\n");
	}

	private static double average(double a, double b, double c) {
		// TODO Auto-generated method stub
		return (a+b+c)/3;
	}

	private static double smallest(double a, double b, double c) {
		// TODO Auto-generated method stub
		 return Math.min(Math.min(a, b), c);
	}

}
