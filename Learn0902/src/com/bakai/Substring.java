package com.bakai;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String total = "you will be assigned a random place in line alongside";
		 String search = "everyone";
		 String sub = "else";
		 String result = "";
		 int i;
		 
		 do { // replace all
			 System.out.println(total);
			 i = total.indexOf(search);
			 if(i != -1) {
				 result = total.substring(0,i);
				
				 result = result + sub;
				
				 result = result + total.substring(i + search.length());
				 total = result;
				 
			 }
		 } while (i != -1);
		 
	}
}

