package com.naza;

import java.util.Scanner;

public class PalIndrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		        Scanner kbd = new Scanner(System.in);
		        System.out.println("Enter a number");
		        int number = kbd.nextInt();
		        if(isPalindrom(number)) {
		            System.out.println("Number is a palindrom.");
		        } else {
		            System.out.println("Number is not a palindrom");
		        }
		        kbd.close();
		    }
		    private static boolean isPalindrom(int number){
		        int temp = number;
		        int remainder;
		        int reverse = 0;
		        while (temp>0) {
		            remainder = temp%10;//
		            temp/=10;
		            reverse= (reverse*10) + remainder;
		        }
		        return reverse ==number;
		    }

		

	}


