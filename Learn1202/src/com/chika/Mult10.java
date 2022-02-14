package com.chika;

import java.util.Scanner;

public class Mult10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Input a number:");
		int a = scan.nextInt();
		for (int i = 1;i<=10; i++) {
			System.out.println(a + " x " + i + " = " + (a*i));
		}
		
	}

}
