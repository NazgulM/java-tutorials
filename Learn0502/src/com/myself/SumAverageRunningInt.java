package com.myself;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		double average;
		int min = 1;
		int max = 100;
		
		 
		for (int num = min; num <= max; num++) {
			sum+=num;
			System.out.println(sum);
        average = sum/num;
        System.out.println(average);
		}
	
	}

}
