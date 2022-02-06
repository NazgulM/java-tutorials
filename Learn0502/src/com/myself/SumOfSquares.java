package com.myself;

public class SumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int num1 = 1;
		int num2 = 100;
		int sum = 0;
		
		// calculating sum of squares from num1 to num2
		while (num1 <= num2) {
			sum+=num1*num1;
			num1++;
			System.out.println(sum);
		}
		
	}

}
