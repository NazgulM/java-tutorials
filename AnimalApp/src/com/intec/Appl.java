package com.intec;

import java.util.Arrays;
import java.util.Scanner;

public class Appl {

	public static void main(String[] args) {
	
		int i = 1;
		/*do {
		//code exec
			System.out.println("Hello");
			i ++;
		}while(i<=5);
		
		while(i<=5); { 
			System.out.println("hello while roadrunner");
			i++;
			
			
			//for loop
			/*for(initex;condition;updateex;) {
				// body
				//
			}*/
			/*for(int y = 0;y<10;y++) {
				System.out.println("Hello " + y);
			
				
				for(;i<5;i++) {*/
		
		         /*for(;i<5;i++) {
		           System.out.println("for loop condition" + i);*/
		           
		
		/*String companyName = "IntecBrussel";
		System.out.println(companyName.length());
				for (;i<companyName.length();i++) {
					//0-12
					//System.out.println(companyName.charAt(i));
				}
				//System.out.println(companyName.split("")[1]);
				Arrays.asList(companyName.split("")).forEach(x->System.out.println(x));
				int [] numbers = new int [5];
				
				
				numbers [0] = 20;
				numbers [1] = 21;
				numbers [2] = 22;
				numbers [3] = 23;
				numbers [4] = 24;
				
				System.out.println(numbers.length);
				
				for (int y=0;y<numbers.length;y++) {
				System.out.println(y);*/
				
		
		Scanner keyboard = new Scanner (System.in);
		//ystem.out.println("How many items you want to create?");
		//int howMany = keyboard.nextInt();
		
		//int [] MyNumbers = new int [howMany];
		
		/*for (int x=0; x<howMany;x++) {
			MyNumbers [x] = x*2;
	}
		/*int x;
		//print them out
		System.out.println(MyNumbers[x]);
		*/
		
		int arrNumber[], array_size;
		System.out.println("How many Numbers?");
		
		array_size = keyboard.nextInt();
		arrNumber = new int[array_size];
		while(array_size < 0) {
			array_size --;
			System.out.println("Enter a number= ");
			array_size = keyboard.nextInt();
		}
		
}

}
		

	


