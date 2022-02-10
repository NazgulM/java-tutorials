package com.bakai;

public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String str = "You can edit Java code and view the result in your browser.";
		System.out.println(str);
		System.out.println("indexOf(a) = " + str.indexOf('a'));
		System.out.println("lastindexOf(a) =" + str.lastIndexOf('a'));
		System.out.println("indexOf(and) = " + str.indexOf("and"));
		System.out.println("lastindexOf(the) = " + str.lastIndexOf("the"));
		System.out.println("indexOf(t, 10) = " + str.indexOf('t', 10));
		System.out.println("lastIndexOf(t, 60) = " + str.lastIndexOf('t', 60));
		
		String s1 = String.valueOf('C');
		System.out.println(s1);
		String s2 = String.valueOf("10");
		System.out.println(s2);
		String s3 = String.valueOf(false);
		System.out.println(s3);
	}

}
