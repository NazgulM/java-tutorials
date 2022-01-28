package com.tutorial;

public class mod7sum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, count = 0;
		for (int i = 1; i < 1000; i++) {
			if (i %7 ==0) {
				
				sum = sum+i;
				count++;
				
				System.out.println(sum);
				
	}
		}
	}
}
