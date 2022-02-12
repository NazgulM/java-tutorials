package com.bakai;

public class StringBuilder {

	public StringBuilder(int i) {
		// TODO Auto-generated constructor stub
	}

	public StringBuilder(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder(200);// capacity 200, length 0
		sb.append("Hello");// capacity 200, length 5
		int len = sb.length();
		int capacity = sb.capacity();
		System.out.println(len);
		System.out.println(capacity);
		
		
		
	}

	private int capacity() {
		// TODO Auto-generated method stub
		return 200;
	}

	private int length() {
		// TODO Auto-generated method stub
		return 5;
	}

	void append(String string) {
		// TODO Auto-generated method stub
		
	}

}
