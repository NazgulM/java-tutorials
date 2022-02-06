package com.myself;

public class SumAverageDoWhile {

	public static void main(String[] args) {
		// TO
		
		int sum = 0;
		int min = 111;
		int max = 8899;
		int number = min;
		double average = 0;
		
		do {
			sum+=number;
			++number; 
		} while (number<=max);
		System.out.println(sum);
		
		average = sum/number;
		System.out.println(average);
		}

	}


