package be.technifutur.menu;

import be.technifutur.menu.actions.*;

/*
 * La classe Utils contient la méthod intInput() qui s'assure que le nombre entier est bien un int
 */

import be.technifutur.util.Utils;

public class Main {
	public static void main(String[] args) {
		/*
		 * Variables locales
		 */
		int choix = 0, numberOfPrograms = 5;
		boolean exit = false;
		
		do {
			/*
			 * Saisie du choix du l'utilisateur
			 */
			do {
				if (choix < 0 || choix > numberOfProgram)
					System.out.println("Choix invalide!");
			
				System.out.println("Que voulez-vous faire ?");
				System.out.println("(0) Quitter le menu");
				System.out.println("(1) Afficher Hello world");
				System.out.println("(2) Permuter deux nombres entiers");
				System.out.println("(3) Vérifier les années bissextiles");
				System.out.println("(4) Résoudre une équation du 1er degré");
				System.out.println("(5) Calculer une factorielle");
				choix = Utils.intInput();
				System.out.println();
			} while (choix < 0 || choix > numberOfPrograms);
			
			/*
			 * Traitement du choix de l'utilisateur, pour exécuter le programme correspondant
			 */
			switch (choix) {
				case 0:
					System.out.println("Fin du programme");
					exit = true;
					break;
				case 1:
					Helloworld hello = new Helloworld();
					hello.run();
					System.out.println();
					break;
				case 2:
					Permutation permutation = new Permutation();
					permutation.run();
					System.out.println();
					break;
				case 3:
					Bissextile bissextile = new Bissextile();
					bissextile.run();
					System.out.println();
					break;
				case 4:
					System.out.println("Pas encore implémenté");
					System.out.println();
					break;
				case 5:
					System.out.println("Pas encore implémenté");
					System.out.println();
					break;
			}
		} while (!exit);
	}
}
