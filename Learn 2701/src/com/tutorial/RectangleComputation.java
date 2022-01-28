package com.tutorial;

import java.util.Scanner;

public class RectangleComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cylinder Computation
		//double surface area,  base area, volume of a cylinder;
		
		double radius  = 1.2;
		double h = 3.2;
		double PI = 3.14;
		double surfaceArea = 2 * PI * radius*(radius+h);
		double volume  = PI * radius * radius * h;
		double baseOfArea = (PI * radius*radius);
		
		System.out.println("The surface area of Cylinder: " + surfaceArea);
		System.out.println("The volume of a cylinder: " + volume);
		System.out.println("The base of Area: " + baseOfArea);

		
		/*double width, height, area, perimeter;
		Scanner sc = new Scanner(System.in);
				
		double width1 = 4.95d;
		double height1 = 7.95d;
		double area1 = width1*height1;
	    double perimeter1 = 2 * (width1 + height1);
	    System.out.println(area1);
	    System.out.println(perimeter1);
		*/
	}

}
