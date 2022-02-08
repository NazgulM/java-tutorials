package com.aruuke;

public class StringCharIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Aruuke";
		//get the length of string
		int len = s.length();
		// loop through all char and print their indexes
		for (int i = 0; i <len; i++) {
			System.out.println(s.charAt(i) + " is at index " + i);
		}
		
	}

}
