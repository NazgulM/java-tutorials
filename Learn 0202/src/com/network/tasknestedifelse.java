package com.network;

public class tasknestedifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1 = -1.23, num2 = 2.56, num3 = -10.1, largest;
		//checks if n1 greater than n2
		if(num1>=num2) {
			// if else statement inside the if block
			if (num1>=num3) {
				largest = num1;
			} else {
				largest = num3;
			} 
		    } else {
				//if else statement inside the  else statement
		    	if(num2>=num3) {
		    		largest = num2;
		    	} else {
		    		largest = num3;
			
			}
		}
		System.out.println("Largest number "+ largest);
	}

}
