package com.nurs;

public class PrintContentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String [] names = {"Java", "C++", "Python", "Javascript"};
		System.out.println("Printing the content of the array names:\n");
		for (String name:names) {
			System.out.println(name);*/
		int a,b,c;
		a:
			for (int i = 0; i<=10; i++) {
				b:
					for (int j = 0; j <=15; j++) {
						c:
							for (int k = 0; k<=20; k++) {
								System.out.println(k);
								if (k == 5) {
									break a;
								}
							}
					}
		}
	}

}
