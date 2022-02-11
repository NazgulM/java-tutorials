package com.naza;

import java.util.ArrayList;
import java.util.List;

public class StringConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    List<String> list  = new ArrayList<>();
    list.add("Nursultan");
    list.add("Aruuke");
    list.add("Bakai");
    System.out.println("List object:"  + list);
    
    //list object to String
    String str= String.join(", ", list);
    System.out.println("String: "+ str);
	}

}
