package com.tutorials;

import java.util.Random;
import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
       int a = 10;
       int b = 100;
	  
       int rand_number1 = a + (int) (Math.random() * b); //generation of 1st number
       System.out.println("First random number" + rand_number1);
       
       int rand_number2 = a + (int) (Math.random() * b); // generation of second number
       System.out.println("Second random number" + rand_number2);
       
       int rand_number3 = a + (int) (Math.random() * b); // generation of third number
       System.out.println("Third random number" + rand_number3);
       
       int rand_number4 = a + (int) (Math.random() * b); // generation of fourth number
       System.out.println("Fourth random number" + rand_number4);
       
       int rand_number5 = a + (int) (Math.random() * b); // generation of fifth number
       System.out.println("Fifth random number" + rand_number5);
       
       int rand_number6 = a + (int) (Math.random() * b); // generation of sixth number
       System.out.println("Sixth random number" + rand_number6);
       

}
}
