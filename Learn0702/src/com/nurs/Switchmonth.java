package com.nurs;

public class Switchmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int number  = 7;
		String monthString = "";
		// switch statement
		switch (number) {
		case 1: monthString="1 - January";  
	    break;    
		case 2: monthString="2 - February";  
		break; 
	    case 3: monthString="3 - March";  
	    break;    
	    case 4: monthString="4 - April";  
	    break;
	    case 5: monthString="5 - May";  
	    break;   
	    case 6: monthString="6 - June";  
	    break;   
	    default: System.out.println("Invalid month");
		}
		System.out.println(monthString);*/
		
		//Switch with String
		String levelString = "Expert";
		int level;
		
		switch (levelString) {
		case "Beginner": level=1;  
	    break;    
	    case "Intermediate": level=2;  
	    break;    
	    case "Expert": level=3;  
	    break;    
	    default: level=0;  
	    break;  
	    }    
	    System.out.println("Your Level is: "+level);  
	}    
	}   