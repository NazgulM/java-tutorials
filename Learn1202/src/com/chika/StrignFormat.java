package com.chika;

import java.util.Scanner;

public class StrignFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the value in meters: ");
		double meter = scan.nextDouble();
		double feet;
		//1 meter is 3.28 feet
		feet = meter*3.28;
		System.out.println("The formatting meter to feet: " + feet);
		}
		
	}


