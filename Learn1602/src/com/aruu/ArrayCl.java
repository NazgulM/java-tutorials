package com.aruu;

import java.util.Scanner;

public class ArrayCl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int [] numbers = {1,2,3,4,5};
		for (int i:numbers) {
			System.out.println(i);*/
			//multi-dimensional array
			int [][]numbers1 = {{10,20,30},{40,50,60}};
			for (int a=0;a<2;a++) {
				for (int b = 0; b<3;b++) {
					System.out.println(numbers1[a][b]);
					
					Scanner input = new Scanner(System.in);
			        System.out.print("Input the length of a side of the hexagon: ");
			        double s = input.nextDouble();
			        System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
			    }}}
			    public static double hexagonArea(double s) {
			        return (6*(s*s))/(4*Math.tan(Math.PI/6));
		
	}
}


