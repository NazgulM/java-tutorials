package nazgul;

import java.util.Scanner;
import java.lang.String;
public class Scannerclass {

	public static void main(String[] args) {

		       //Scanner object
				Scanner scanner = new Scanner(System.in);

				
				System.out.println("What's your name?");
				String name =scanner.nextLine();
				
				System.out.println("What city do you live in?");
				String city = scanner.nextLine();
				

				System.out.println("What's your age?");
				int age  = scanner.nextInt();
				
			
				System.out.printf("My name is %s. I live in %s. I am %d%n years old.",name,city,age);
				
				
				scanner.close();
				

	}

}
