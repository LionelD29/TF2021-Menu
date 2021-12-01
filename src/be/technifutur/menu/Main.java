package be.technifutur.menu;

import be.technifutur.menu.actions.*;

/*
 * La classe Utils contient la méthod intInput() qui s'assure que le nombre entier est bien un int
 */

import be.technifutur.util.Utils;

public class Main {
	public static void main(String[] args) {
		int choix = 0;
		Runnable[] actions = {new Helloworld(), 
							new Permutation(), 
							new Bissextile(),
							new Factorial(),
							new FirstDegreEquation()};
		
		do {
			/*
			 * Saisie du choix du l'utilisateur
			 */
			do {
				if (choix < 0 || choix > actions.length) {
					System.out.println("Choix invalide!");
				}
			
				System.out.println("Que voulez-vous faire ?");
				System.out.println("(0) Quitter le menu");
				System.out.println("(1) Afficher Hello world");
				System.out.println("(2) Permuter deux nombres entiers");
				System.out.println("(3) Vérifier les années bissextiles");
				System.out.println("(4) Calculer une factorielle");
				System.out.println("(5) Résoudre une équation du 1er degré");
				choix = Utils.intInput();
				System.out.println();
			} while (choix < 0 || choix > actions.length);
			
			/*
			 * Traitement du choix de l'utilisateur, pour exécuter le programme correspondant
			 */
			 
			if (choix != 0) {
				actions[choix - 1].run();
			} else {
				System.out.println("Fin du programme");
			}
			
			System.out.println();
		} while (choix != 0);
	}
}
