package uebungen;

import java.util.Scanner;

public class XProjekt {

	public static void main(String[] args) {
		xberechnen();
	}
	
	public static void xberechnen() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Wie groß soll das X sein? (nur ungerade Zahl zulässig)");
		int groesse=sc.nextInt();
		
		if (groesse%2!=0) {
		
			//die obere Hälfte berechnen
			for (int i=0; i<groesse; i+=2) {
				System.out.print("x");
				for (int leerzeichen1=0; leerzeichen1<groesse-2-i; leerzeichen1++) {   //Leerzeichen zwischen den X oben
					System.out.print(" ");
				}
				System.out.print("x");
				System.out.println();
				for (int leerzeichen2=0; leerzeichen2<1+i/2; leerzeichen2++) {   //Leerzeichen links der X oben
					System.out.print(" ");
				}
				if (i==groesse-3)    //Abbruch vor der Mitte des X
					break;
			}		
		
			//das X für den Mittelpunkt erstellen
			for (int xmitte=groesse/2; xmitte==groesse/2; xmitte++)
				System.out.print("x");
				System.out.println();
		
			//die untere Hälfte berechnen  
			for (int j=0; j<groesse/2; j++) {
				for (int leerzeichen3=1; leerzeichen3<groesse/2-j; leerzeichen3++) {   //Leerzeichen links der X unten
					System.out.print(" ");
				}
				System.out.print("x");		
				for (int leerzeichen4=0; leerzeichen4<1+2*j; leerzeichen4++) {   //Leerzeichen zwischen den X unten
					System.out.print(" ");
				}
				System.out.print("x");
				System.out.println();
			}
		}
		else { 
			System.out.println("Error");
			System.out.println("Bitte ungerade Zahl eingeben");
			System.out.println();
			xberechnen();
		}
		sc.close();
	}
}