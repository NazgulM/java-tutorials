package com.tutorials;

import java.util.Scanner;

public class total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 1 add income int
		 2 add expenses 
		 3 total budget
		 4 total expenses
		 5 exit
		 */
		int income = 5000;
		int expenses = 3000;
		int budget = 6000;
		boolean budget2 = true;
		
		Scanner input = new Scanner(System.in);
	
		
		while(budget2) {
			System.out.println("Please enter your income: ");
			income = income + input.nextInt();
			System.out.println("Please enter your expenses: ");
		    expenses = expenses + input.nextInt();
		    budget = income - expenses;
			System.out.println("Your total budget is: " + budget);
			
			switch(budget) {
			case 1000:
				System.out.println("Enough spending money now!");
				budget2 = false;
				input.close();
				
			}
		}
		
		
		
	}


	}


