package com.aruuke;

public class GetCharTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "So if I had to write a class";
		 int start  = 10;
		 int end = 14;
		 char []buf= new char[end-start];
		 
		 str.getChars(start, end, buf, 0);
		 System.out.println(buf);
		 
		 String str1 = "intec.be";
		 String str2 = "";
		 
		 // using isEmpty method
		 boolean empty1= str1.isEmpty();
		 boolean empty2 = str2.isEmpty();
		 
		 // using the equals method ()
		 boolean empty3 = "".equals(str1);
		 boolean empty4 = "".equals(str2);
		 
		 // comparing length of the string with the 0
	     boolean empty5 = str1.length() == 0;
	     boolean empty6 = str2.length() ==0;
		 
		 System.out.println(empty1);//intec.be
		 System.out.println(empty2);// empty
		 System.out.println(empty3); // same as str1
		 System.out.println(empty4);// as str2
		 System.out.println(empty5);//str1
		 System.out.println(empty6);//str2 is empty
	} 

}
