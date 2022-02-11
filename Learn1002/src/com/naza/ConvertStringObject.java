package com.naza;

public class ConvertStringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj = "Nazgul portal";
		System.out.println("Object value: " + obj);
		String str = String.valueOf(obj);
		System.out.println("String value of: " + str);
		
		//+ operator in Java
		String str1 = "" + obj; 
		System.out.println("String1 value is: " + str1);
		
		//String.to method for convert
		String str2 = obj.toString();
		System.out.println("String2 value of: " + str2);
		
		// convert any object to String
		Integer iVal = 123;
		System.out.println("Integer object value: " + iVal);
		String str3 = iVal.toString();
		System.out.println("String3 velue is:" + str3);
	}

}
