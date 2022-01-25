package com.intec;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World"); // This a comment
		
		String firstName = "Nursultan ";
		String lastName = "Baktiiarov";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		//
		float f1 = 35e3f;
		double d1 = 12e4d;
		System.out.println(f1);
		System.out.println(d1);
		
		//widening casting
		int myInt = 12;
		double myDouble = myInt;
		System.out.println(myInt);
		System.out.println(myDouble);
		
		//narrowing casting
		double d2 = 166.66; //converting double data type to long data type
		long l = (long)d2; //converting long data type into int data type
		int i= (int)l;
		System.out.println("Before conversion " + d2);
		//fractional part lost
		System.out.println("After conversion into long type " + l);
		System.out.println("After conversion into int type " + i);
		
		//concatenation
		String name = "Chika ";
		String nickName = "Lord";
		System.out.println(name. concat(nickName));
		
		//Uppercase
		String txt = "London is a capital of Great Britain.";
		System.out.println(txt.toUpperCase());
		
		//index
		String txt1 = "In addition to their direction";
		int index = txt1.indexOf('a');
		System.out.println(index);
		
	}

}
