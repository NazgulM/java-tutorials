package com.nurs;

public class Stringequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "Nazgul";
		String s2 = "Nazgul";
		String s3 = "Nursultan";
		String s4 =  "NAZGUL";
		System.out.println(s1 + " equals " + s2 + " ->" + s1.equals(s2));
		System.out.println(s1 + " equals " + s3 + " ->" + s1.equals(s3));
		System.out.println(s1 + " equals " + s4 + "->" + s1.equals(s4));
		System.out.println(s1 + " equalsIgnoreCase " + s4+ "->" + s1.equalsIgnoreCase(s4));
	}

}
