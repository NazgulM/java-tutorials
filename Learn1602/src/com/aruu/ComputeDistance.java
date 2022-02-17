package com.aruu;

import java.util.Scanner;

public class ComputeDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Input the first latitude of coordinate: ");
		double x1 =scan.nextDouble();
		System.out.println("Input the first longtitute of coordinate: ");
		double y1 =scan.nextDouble();
		System.out.println("Input the second latitude of coordinate: ");
		double x2 = scan.nextDouble();
		System.out.println("Input the second longtitude of coordinate: ");
		double y2 = scan.nextDouble();
		/*float radiusEarth = 6371.01f;
		float d = radiusEarth* arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2));*/
		System.out.println("The distance between those points is: " + distance_between_LatLong(x1,y1,x2,y2) + "km\n");
	}

	private static double distance_between_LatLong(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		x1 =Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		double earthRadius = 6371.01;
		
		return earthRadius * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - y2));
	}

	
	}


