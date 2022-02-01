package com.study;

import java.util.Scanner;

public class Tasksalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int startuur = 0;
         int startminuut = 0;
         int stopuur = 0;
         int stopminuut = 0;
         float loon = 0;
         float uurloon = 11.50f;
         int startdag = 0;
         int einddag = 0;
         int Ma = 1;
         int Di = 2;
         int Woe = 3;
         int Do = 4;
         int Vr = 5;
         int Za = 6;
         int Zo = 7;
         Scanner scan = new Scanner(System.in);

         System.out.println("Enter startuur: ");
         startuur = scan.nextInt();
         System.out.println("Enter startminuut ");
         startminuut = scan.nextInt();

         System.out.println("Enter stopuur: ");
         stopuur = scan.nextInt();
         System.out.println("Enter stopminuut ");
         stopminuut = scan.nextInt();
         int aantalgewerkteuren = 0;

         if (stopuur >= startuur) {
             aantalgewerkteuren = stopuur - startuur;

         } else {
             aantalgewerkteuren = (stopuur - startuur) + 24;
         }
         if (startuur > 0 && stopuur > 0) {
             System.out.println("Aantalgewerkteuren " + aantalgewerkteuren);
         } else {
             System.out.println("Negatief cijfer is niet geaccepteerd");
         }

         loon = aantalgewerkteuren * uurloon;
         System.out.println("Loon " + loon);
         System.out.println("Enter a day:");
         int day = scan.nextInt();


         switch (day) {

             case 1:
                 System.out.println("Maandag " + loon);
                 break;

             case 2:
                 System.out.println("Dinsdag " + loon);
                 break;
             case 3:
                 System.out.println("Woensdag " + loon);
                 break;
             case 4:
                 System.out.println("Donderdag " + loon);
                 break;
             case 5:
                 System.out.println("Vrijdag " + loon);
                 break;
             case 6:
                 loon = loon + ((loon * 25) / 100);
                 System.out.println("Zaterdag " + loon);
                 break;

             case 7:
                 loon = loon + ((loon * 50) / 100);
                 System.out.println("Zondag " + loon);
                 break;


         }
     }
 
	}


