package com.tutorial;

import java.util.Scanner;

public class Sumofsquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Input: ");
		int num =sc.nextInt();
		int sum = 0;
		while(num>0) {
			int mod = num % 1000;
			sum = sum + (mod*mod);
			num = num/1000;
		}
		System.out.println("Output:  Sum of Squares= " +sum);
	}

}
