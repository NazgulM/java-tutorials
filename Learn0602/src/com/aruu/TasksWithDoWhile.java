package com.aruu;

public class TasksWithDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 45;
		do {
			System.out.println("Value of a: " + a );
			a++;
			
		}
		while (a<44); 
		
		int sum = 0;
		// for loop begins and runs till 44
		for (int i = 10; i<=44;i++) {
			sum = sum+i;
			System.out.println("The sum is: " + sum);
		}
	}

}
