package com.study;

public class Tasksnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int number = 1;number<=1000;number++) { //from 1 to 1000
			if((number % 3 ==0 || number % 5 ==0 ||number % 7== 0)&& (number % 15 != 0 ||number % 21 != 0 ||number %35 != 0|| number % 105 != 0 )) { 
				// take numbers divide by 3,5,7, and not divide by 15,21,35,105
				sum = sum + number;
			}
			
		}
		System.out.println("Answer is: " +sum);
	}

}
