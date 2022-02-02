package com.year;

public class Yearlogicaltask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 1582;
		int month = 10;
		int date  = 15;
		boolean event = true;
		
		System.out.println((year<1582) ||(year ==1582)&& (month<10));
		System.out.println((year==1582)&&(month>=10)&&(date<20));
		
		
		int mark = 49;
		
	    System.out.println("The mark is: " + mark);
	    if(mark>=0) {
	    	System.out.println("F");
	    } else if (mark>=49) {
	    	System.out.println("F");
	    }else if (mark>=50) {
	    	System.out.println("C");
	    } else if (mark>=51) {
	    	System.out.println("C");
	    } else   {
	    	System.out.println("A");
	    }
	    
	    
	    

	    }
	}

	     

