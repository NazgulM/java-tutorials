package com.nurs;

public class NewString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line1 = "null";
		String line2 = line1 +"\nhi!";
		System.out.println(line2);
		
		int count = 55;
		String msg = "Number: " + count;
		System.out.println(msg);
		
		String s = "Hello";
		int len = s.length();
		System.out.println(len);
		
		// string trim
		
		String name = "   Ablabekova Nazgul   ";
		name = name.trim();
		System.out.println(name);
		
		String str = "international";
		String b = str.substring(2,6);
		System.out.println(b);
		
		// String split
		String address = "Brussels:Uccle:1180:Avenue Coghen 268 b, ap.7";
		String[] parts = address.split(":");
		
		for (int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}
	}

}
