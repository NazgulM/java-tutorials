package com.nurs;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		 a = (b=3) * 2;
		 
		 System.out.println("A: " + a + " B: "+ b);
		 
		 int x;
		 int y = 2;
		 x= (y=3)*y;
		 System.out.println("X: " + x + " Y: " + y);
		 
		 int num1 =12;
		 int num2= 56;
		 int num3 = 9;
		 
	     int d1 = num1*num2/num3;
	     int d2 = num1*(num2/num3);
	     System.out.println("D1: " + d1+" D2: "+ d2);
	}

}
