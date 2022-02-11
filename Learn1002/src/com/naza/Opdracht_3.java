package com.naza;

import java.util.Scanner;

public class Opdracht_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=25;
        System.out.println("Input an integer: ");
        Scanner kbd = new Scanner(System.in);
        int number1 = kbd.nextInt();
        System.out.println("The sum is: "+sumDigits(number1));
        kbd.close();
    }
    public static int sumDigits(int number){
       int result =0;
       while(number>0){
           result += number %10;
           number/=10;
	}
	return result;

	
	}
}

