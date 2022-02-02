package com.network;

public class TaskModulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 200;
		int number2 = 150;
		int mod = 0;
		
		mod = number1%number2;
		System.out.println("Remainder: " +mod);
		
		int num1 = 350;
		int num2 = 220;
		
		num1%=num2;
		System.out.println("Num1: " +num1);
		
		boolean cond  = true;
		int n1 = 122;
		int n2 = 256;
		System.out.println("Condition is: " + !cond);
		System.out.println("!(n1<n2)" + !(n1 < n2));
		System.out.println("!(n2>n1)" + !(n2>n1));
		System.out.println("!(n1>n2" + !(n1>n2));
		
		int a = 14;
		int b = 18;
		int c = 89;
		int d =  0;
		
		if ((a>b) && (b<c)) {
			d = a+b+c;
			System.out.println("The sum is: " + d);
		} else {
			System.out.println("False conditions");
			
			int z = 78;
			int x = 85;
			int v = 12;
			
			if ((z>x) || (x>v)) {
				System.out.println("One or both conditions are true");
			} else {
				System.out.println("Both of them are false");
			}
			
		}
	}

}
