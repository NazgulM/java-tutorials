package com.aruuke;

public class StringArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] str  = {"one", "two","three"};
		
		for (int i = 0;i<str.length;i++) {
			System.out.println("str[" + i+ "]:" + str[i]);
			
			String str1 =new String();
			String str2 = new String("Welcome to the USA");
			
			// get the length of str1 and str2 using int length
			int len1 = str1.length();
			int len2 = str2.length();
			
			//display the length of str1 and str2
			System.out.println("Length of \"" + str1+ "\" = " +len1);
			System.out.println("Length of \"" + str2 + "\" = "+ len2);
		}
	}

}
