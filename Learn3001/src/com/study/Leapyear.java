package com.study;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count  = 0;
		for (int i = 999; i < 2010; i++  ) {
			if ((i % 4 == 0 && i % 100 !=0) || i % 400 ==0) {
				System.out.println(i);
				count++;
				if(count % 10==0) {
					System.out.println(count);
				}
			}
		}
	}

}
