package com.tutorial;

import java.util.Arrays;

public class hi {

	private static final String ArraystoString = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 20%3;
		System.out.println(x);
		
		int a= 5;
		int b = 10;
		int z = Math.max(a, b);//maximum number
		System.out.println(z);
		
		int y = 16;
		double num = Math.sqrt(y);//square root
		System.out.println(num);
		
		int number1 =0;
		int number2= 1;
		double number = Math.random();//he correct method to return a random number between 0 (inclusive), and 1 (exclusive).
		System.out.println(number);
		
		String msg;
		msg = "Hello";
		System.out.println(msg);
		
		int n1 = 98;
		int n2 = 5;
		int n3 = 3;
		int sum = n1+n2+n3;
		int dif = n1-n2 -n3;
		int product = n1*n2*n3;
		int quot = n1/n2/n3;
		int rem = n1%n2%n3;
		System.out.println(" The sum: " + sum + " The difference: " + dif + " The product: " + product + " The quotient: " + quot + " The remainder: " + rem);
		
		int w = 3;
		int q = 6;
		int e = w*31 + q*17;
		System.out.println(e);
		
		//addition and assignment
		int r = 77;
		int t = 66;
		int u = t+=r;
		System.out.println(u);
	
		
		//new lessons
		int o = 30;
		int p = o;
		System.out.println("Total: ");
		System.out.println("o= " + o + ", p = " + p);
		
		
		//if p change to 45
		p = 45;
		System.out.println("o= " + o + ", p = " + p);
		
		System.out.println("REFERENCE DATA TYPES\n");
		int [] d = {10,20,30,40};
		int [] s =d;
		
		System.out.println("Array d = " +Arrays.toString(d));
		System.out.println("Array s = " + Arrays.toString(s));
		//modifying the valu at index 1 to 50 in array s
		
		s[1] = 50;
		System.out.println("After modification");
		System.out.println("Array d  = " +Arrays.toString(d));
		System.out.println("Array s = " +Arrays.toString(s));
		
	}

	
	}


