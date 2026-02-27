package uebungen;

import java.util.Scanner;

public class WeihnachtsbaumProjekt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wie groß soll der Baum sein?");
		int groesse=sc.nextInt();
		System.out.println("Wieviele Bäume sollen es sein?");
		int anzahl=sc.nextInt();
		
		//Anzahl der Zeilen berechnen
		for (int i=0; i<groesse; i++) {
			//Anzahl der Leerzeichen berechnen
			for (int leerzeichen1=0; leerzeichen1<groesse-1-i; leerzeichen1++) 
				System.out.print(" ");		
			//Anzahl der Sterne berechnen
			for (int sternchen1=0; sternchen1<1+2*i; sternchen1++)  
				System.out.print("*");		
			//weitere Bäume zeichnen
			for (int durchlaeufe=1; durchlaeufe<anzahl; durchlaeufe++) {
				if (anzahl==1)
					break;
				else {
					//Anzahl der Leerzeichen berechnen
					for (int leerzeichen2=0; leerzeichen2<2*(groesse-1-i)+1; leerzeichen2++) 
						System.out.print(" ");				
					//Anzahl der Sterne berechnen
					for (int sternchen2=0; sternchen2<1+2*i; sternchen2++) 
						System.out.print("*");						
				}
			}
			//Zeilenumbruch nach jeder Zeile
			System.out.println();
		}
		sc.close();
	}
}