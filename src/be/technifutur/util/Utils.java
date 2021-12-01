package be.technifutur.util;

import java.util.Scanner;

public class Utils {
	public static int intInput() {
		int number = 0;
		boolean valid = false;
		Scanner scan = new Scanner(System.in);
		
		/*
		 * Tant que le nombre saisi n'est pas un entier, on recommence en affichant à chaque fois le message d'erreur
		 * Cette méthode permet d'éviter le plantage du programme à cause de la méthode nextInt() du scanner
		 */
		
		while (!valid) {
			try {
				System.out.println();
				System.out.print("Votre choix : ");
				number = scan.nextInt();
				valid = true;
			} catch (Exception e) {
				System.out.println();
				System.out.println("Veuillez saisir un nombre entier");
				System.out.println();
				scan.next();
			}
		}
		
		return number;
	}
}
