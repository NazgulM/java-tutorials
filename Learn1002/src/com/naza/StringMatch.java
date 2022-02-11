package com.naza;

public class StringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "We recommend reading this tutorial";
		//test if str starts with we
		
		if (str.startsWith("We")) {
			System.out.println("String starts with We");
		} else { 
			System.out.println(" String does not starts with we");
		}
		// test if str end with tutorial
		if (str.endsWith("this")) {
			System.out.println("String ends with this");
		} else {
			System.out.println("String does not end with this");
		}
		// String join
		String result = String.join(" ", "Nursultan", "Bakai", "Aruuke");
		System.out.println(result);
		
		result = String.join("  ", "Nazgul's", "e-mail:", "maniyasova.n@gmail.com");
		System.out.println(result);
		
	}

}
