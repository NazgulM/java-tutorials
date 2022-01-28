package com.tutorial;

public class methodles {
	static int sum = 0;
	static int [] nums = {109,99};
///method
	static void HelloWorld () {
		System.out.println("Hello Method!");
	}
	
	//method
	static void Message ( ) {
		System.out.println("Hello friend");
	}
	
	//Change Array method
	static void ChangeArrayValue(int posIndex, int newValue) {
		nums[posIndex] = newValue;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HelloWorld();
        Message ();
       ChangeArrayValue (1,66); //update array item value
       System.out.println(nums[1]);
	}

}
