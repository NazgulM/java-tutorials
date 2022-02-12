package com.bakai;

public class ReverseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("Hello");
		
		//create StringBuilder from the String object s1
		StringBuilder sb = new StringBuilder(s1);
		
		//append Java to the StringBuilder's content
		sb.append("Java");
		
		// get a string from StringBuilder
		String s2 = sb.toString();
		System.out.println(s2);
	}

}
