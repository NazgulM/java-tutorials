package com.aruuke;

public class GreatingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Before method invocation");

        greeting();

        greetPerson("Alex");
        greetPerson("Bart");

        System.out.println("After method invocation");

    }

    public static void greeting() {
        System.out.println("Hello!");
    }

    public static void greetPerson(String name) {
        System.out.println("Hello, " + name);
	}

}
