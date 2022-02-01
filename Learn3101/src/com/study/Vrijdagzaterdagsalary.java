package com.study;

import java.util.Scanner;

public class Vrijdagzaterdagsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int startuur = 0;
         int startminuut = 0;
         int stopuur = 0;
         int stopminuut = 0;
         float loon = 0;
         float uurloon = 11.50f;
         float minuutloon = 0;
         int aantalgewerkteuren = 0;
         int aantalgewerkteminuten = 0;
     
         Scanner scan = new Scanner(System.in);

         do {
         System.out.println("Enter startuur: [0=23]");
         startuur = scan.nextInt();
         } while (startuur < 0 || startuur > 23);
         
         do {
         System.out.println("Enter startminuut [0=59]");
         startminuut = scan.nextInt();
         } while (startminuut < 0 || startminuut > 59);
         
         do {
         System.out.println("Enter stopuur: [0=23] ");
         stopuur = scan.nextInt();
         } while (stopuur < 0 || stopuur > 23);
         
         do {
         System.out.println("Enter stopminuut: [0=59] ");
         stopminuut = scan.nextInt();
         } while (stopminuut < 0 || stopminuut > 59);
         
         
         if (stopuur >= startuur) {
             aantalgewerkteuren = stopuur - startuur;
             
         } else 
             aantalgewerkteuren = stopuur - startuur + 24;
         {
         
         if (stopminuut >= startminuut) {
            	 aantalgewerkteminuten = stopminuut - startminuut;
	 
         } else
        	 aantalgewerkteminuten = stopminuut - startminuut + 60;
         { 
         if (startuur > 0 && stopuur > 0) {
        	
        	 aantalgewerkteminuten = (aantalgewerkteuren*60) + aantalgewerkteuren;
             minuutloon = (uurloon/60) + uurloon;
             loon = aantalgewerkteuren*uurloon;
             System.out.println("Aantalgewerkteuren " + aantalgewerkteuren);
         } else {
             System.out.println("Negatief cijfer is niet geaccepteerd");
         }

         
         System.out.println("Loon " + loon);
         System.out.println("Enter a day:");
         int day = scan.nextInt();


         switch (day) {

             case 1:
                 
             case 2:
                 
             case 3:
                 
             case 4:
                 
             case 5:
                 
       	     case 6:
            	   /* if (beforeMidnight< 23.59 && afterMidnight >23.59) {
            		 beforeMidnight = startuur + startminuut;
            		 afterMidnight = stopuur + stopminuut;
            	     loon  = 
                 System.out.println("Zaterdag " + loon);
                 break;
            	    }
             case 7:
                 loon = loon + ((loon * 50) / 100);
                 System.out.println("Zondag " + loon);
                 break*/


         }
     }
}
	}
}