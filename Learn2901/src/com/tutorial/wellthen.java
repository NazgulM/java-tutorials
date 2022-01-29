package com.tutorial;

import java.util.Scanner;

public class wellthen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int days, hrs, secs;
		
		Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a day: ");
        days = sc.nextInt();
        secs = days * 24 * 60 * 60;
        System.out.println("Seconds: " + secs);
}
}
