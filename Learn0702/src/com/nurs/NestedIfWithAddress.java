package com.nurs;

public class NestedIfWithAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String address = "Maiami, France";
		
		if (address.endsWith("France")) {
			if (address.contains("Brussel")) {
			System.out.println("Your city is: Brussel");
			} else if (address.contains("Maiami")) {
				System.out.println("i want to live in Maiami");
			} else  {
				System.out.println(address.split(",") [0]);
			}
			} else {
				System.out.println("You are not living in France");
			}
		}
	}


