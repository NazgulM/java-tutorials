package com.aruuke;

public class StrignTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String coffee = new String("Coffee");
		String cacao = new String("Cacao");
		System.out.println(coffee.equals(cacao));
		System.out.println(cacao.equals(coffee));
		System.out.println(coffee == coffee);
		System.out.println(coffee == cacao);
		System.out.println(coffee.compareTo(coffee));
		System.out.println(coffee.compareTo(cacao));
		System.out.println(coffee.compareToIgnoreCase(coffee));
				
	}

}
