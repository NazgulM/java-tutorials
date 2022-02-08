package com.nurs;

public class IfElseString {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city = "New York";
		
		if (city=="Brussel") {
			System.out.println("The city is Brussel");
		} else if (city == "New York") {
			System.out.println("New York is my city");
		} else if (city =="Paris") {
			System.out.println("I want to go Paris");
		} else {
			System.out.println("Finally is my capital: " + city);
		}
	}

}
