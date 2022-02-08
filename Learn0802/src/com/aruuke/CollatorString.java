package com.aruuke;

import java.text.Collator;

class CollatorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Nursultan";
		String str2 = "Bakai";
		// Collator according US locale
		Collator collator = Collator.getInstance(java.util.Locale.US);
		
		int result = collator.compare(str1, str2);
		if(result < 0) {
			System.out.println(String.format("%s must be before %s.", str1,str2));
		} else if (result ==0) {
			System.out.println(String.format("%s and %s are must be identical.", str1, str2));
		} else {
			System.out.println(String.format("%s must be after %s.", str1, str2));
		}
	}

}
