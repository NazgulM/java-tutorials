package com.chika;

import java.util.Scanner;

public class Stringtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sen = "Here are some examples of ill-formed text blocks";
		int len = sen.length();
		System.out.println(len);
		
		Scanner scan = new Scanner(System.in);
		String text;
		
		System.out.println("Please input in a sentence: ");
		text = scan.nextLine();
		
		System.out.println(text + "\nhas: " + text.length() + " chars.");
		
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		System.out.println(text.replace('a', 'o'));
		
		System.out.println("Print the number of letter a");
		char searchValue = 'e';
		int count = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) ==searchValue) {
				
					
			}
		}
		System.out.println("The search value has been found: " + count + " times ");		
}
}