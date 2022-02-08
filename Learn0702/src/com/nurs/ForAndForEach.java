package com.nurs;

public class ForAndForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] vowels = {'a','e','u'};
		/*for (int i = 0;i<vowels.length;i++) {
			System.out.println(vowels[i]);*/
		
		for(char item: vowels) {
			System.out.println(item);
		}
		}
	}


