package com.chika;

import java.util.Formatter;

public class FortmatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = " %5.2f meter = %5.2f feet %n";
		final float FACTOR= 3.2808399F;
		
		for (float meter = 1; meter<=20; meter +=0.5) {
			float feet = meter*FACTOR;
			System.out.format(text, meter, feet);
		}
		 
	}

}
