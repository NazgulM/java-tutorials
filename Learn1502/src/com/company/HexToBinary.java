package com.company;

import java.util.Scanner;

public class HexToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // HexaDecimal to Binary=>> HexaDecimal to Decimal -> Decimal To Binary
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a hexnumher: ");
		String hexadecimal = scan.next();
		//converting Hexadecimal to decimal number
		int decimal = Integer.parseInt(hexadecimal,16);
		System.out.println("Converted hexa number to decimal is: " + decimal);
		
		//conversion hexa to binary
		String binary = Integer.toBinaryString(decimal);
		System.out.printf("Hexa to Binary conversion of %s is %s %n",hexadecimal,binary);
		
		//conversion hex to octal
		String octal = Integer.toOctalString(decimal);
		System.out.printf("Hex to Octal conversion of %s is %s %n", hexadecimal,octal);
		
	}

}
