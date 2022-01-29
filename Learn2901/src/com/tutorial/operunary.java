package com.tutorial;

public class operunary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a = 5;
		int b = -5;
		boolean c = true;
		boolean d =false;
		System.out.println(~a);//(-var) - 1 = comp (-6)
		System.out.println(~b); //(5) - 1 = 4
		System.out.println(!c);
		System.out.println(!d);
		
		//|| or
		// && and
		// ! not
		
		boolean q = !(false || true);
		System.out.println(q);*/
		
		//Java arithmetic operators
		/*int a = 10; //1000. is 8
		int b = a<<6; //100000. is 32 add extra zeros
		System.out.println(b);
		
		int q = 25; // 11001 bytes
		int w = q>>2; // 110. 
		System.out.println(w);
		
		//relational operators
		
		int e  = 8;
		int r = 6;
		System.out.println(e==r);
		System.out.println(e!=r);
		System.out.println(e<r);
		System.out.println(e>r);
		System.out.println(e<=r);
		System.out.println(e>=r);*/
		
		//&& operator
		int t = 80;
		int y = 60;
		int u = 40;
		int i = 30;
		System.out.println((t>y) &&(u>i));
		System.out.println((t<y)&&(u>i));
		//|| operator
		System.out.println((y < t)||(i > u));
		System.out.println((t<y) || (u<i));
		//! operator
		System.out.println(!(t<60));
		System.out.println(!(y>i));
		
		
	}
	

}
