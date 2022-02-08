package com.aruuke;

import java.util.*;

public class RandomApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long seed = 14;
		Random random1 = new Random();
		Random random2 = new Random();
		
		System.out.println("Object1 reference:\n" + random1);
		System.out.println("Object2 reference:\n" + random2);
		
		
		System.out.println(random1 + ": " + +random1.nextInt() + ", "+ random2 + ": " + random2.nextInt());
		
		
		    long randomLong = random1.nextLong();
	        double randomDouble = random1.nextDouble();
	        boolean randomBoolean = random1.nextBoolean();

		//System.out.println(random);"Object reference:"
		//System.out.println("Random value: " + random.nextInt());
		
		/*for (int i = 0; i < 6; i++) {
			
			System.out.println(random.nextInt(46));*/
		
		}
	}


