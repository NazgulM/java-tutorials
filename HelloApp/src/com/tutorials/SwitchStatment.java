package com.tutorials;

import java.util.Date;

public class SwitchStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//switch statement
		
		/*int myValue = 2;
		
		switch(myValue) {
		case 0:
			System.out.println("The number is 0");
			break;
		case 1:
			System.out.println("The number is 1");
			break;
		case 2:
			System.out.println("The number is 2"); //we don't use break keywords
			break;
		case 3:
			System.out.println("The number is 3");
			break;
			default:
				System.out.println("None of them is correct");*/
		
		String student = "Jeremy";
		
		switch(student) {
		case "Jeremy":
			System.out.println("Jeremy");
			break;
		case "Kubra":
			System.out.println("Kubra");
			break;
		case "Dilshad":
			System.out.println("Dilshad");
			break;
		case "Irina":
			System.out.println("Irina");
			break;
		case "No Student":
			System.out.println("No Student");
			
		}
		Date date = new Date();
		System.out.println(date.getHours()  + ":" + date.getMinutes() + date.getSeconds());
		System.out.println(date.getDay());
		
		switch(date.getDay()) {
		case 0:
			System.out.println("Zondag");
			break;
		case 1:
			System.out.println("Maandag");
			break;
		case 2:
			System.out.println("Dinsdag");
			break;
		case 3:
			System.out.println("Woensdag");
			break;
		case 4:
			System.out.println("Donderdag");
			break;
		case 5:
			System.out.println("Vrijdag");
			break;
		case 6:
			System.out.println("Zaterdag");
		}
		
		if (date.getDay() == 0) {
			System.out.println("Zondag");
		} else if (date.getDay() == 1) {
			System.out.println("Maandag");
		} else if (date.getDay() == 2) {
			System.out.println("Dinsdag");
		}
		
	} 
}
