package com.tutorial;

import java.util.Arrays;

public class olee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // break;
		for(int i=0;i<10;i++) {
			//System.out.println(i);
			if(i==6) {
				continue;
			}
			//System.out.println(i + "result");
		}
		//Arrays int/char/str/byte
		String[] names = {"Jeremy", "Dilshad","Irina"};
		//System.out.println(names[0]);
		for(int i= 0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		
			//System.out.println(x);
		    for(int i= 0;i<names.length;i++) {
			if(i % 2 == 0) {
				//odd numbers
				//before updating 
				System.out.println("before" + numbers[i]);
				
				//update odd number values with 999 here
				numbers [i] = 999;
				
				System.out.println("after" + numbers[i]);
			}
		}
		
		int [][]multiArray = { {1,2,3}, {4,5,6} };
		System.out.println(multiArray[0][2]);
		System.out.println(multiArray [1][2]);
		for (int i=0;i<multiArray.length;i++) {
			//System.out.println(i);
			//System.out.println(multiArray[i].length);
			System.out.println(multiArray [i][0]);
			for (int y=0;y<multiArray[i].length;y++) {
				System.out.println(multiArray [i][y]);
				System.out.println("SubArray Index Number " + i);
				System.out.println("SubArray Item Index Number "+ y) ;
			}
			
			int a[]  = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	 		int b []  = {11,33,33,65,88,66,44,99,11};
			String [] xyz = {"root", "root", "admin", "user", "guest", "user"};
			for (int x =0; x < b.length - 1; x++) {
				System.out.println("first loop" + b[x]);
				
				for (int y=x+1;y<b.length;y++) {
					System.out.println("second loop" + b[y]);
					if(b[x] == b[y]) {
						System.out.println(b[y] + "duplication found");
					}
				}
			}
		}
	}
	

}
