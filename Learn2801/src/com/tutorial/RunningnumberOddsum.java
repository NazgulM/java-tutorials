package com.tutorial;

public class RunningnumberOddsum {
	static int min = 1;
	static int max = 1000;
	static int sum = 0;
	static int number = min;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		while(min < max) {
			if(min%2==0) {
				sum+=min;		
			}
			min++;
			System.out.println(sum);
		}
	}

}
