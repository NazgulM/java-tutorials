package com.nurs;

import java.util.Scanner;

public class StringWithScanner {
	
  static Scanner scan = new Scanner(System.in);
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		String [] word = str.split("\\s+");
		for (String w: word) 
			System.out.println(w);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		s =s.replaceAll("books","games");
		System.out.println(s);
			
		}
		
	}


