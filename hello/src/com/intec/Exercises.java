package com.intec;

public class Exercises {

	public static void main(String[] args) {
		
		/*for (int i = -1; i <= 29; i+=3) {
			System.out.println(i);
			*/
		int sum=0;
		for (int i = 0; i <10; i++) {
			sum+=i*3;
			System.out.println((i*3) - 1);
			
			/*
			 * 0*3 = 0-1 = -1
			 * 1*3 = 3-1 = 2
			 * 2*3 = 6-1= 5
			 */
	
		
			String companyName = "INTECBRUSSEL";
			/*for (char Letter : companyName.toCharArray()) {
				System.out.println(Letter);
				*/
			companyName.chars().forEach(letter->System.out.println((char)letter));
			}
		}
		
		
		
		

	}


