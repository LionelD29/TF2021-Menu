package be.technifutur.menu;

// La classe Utils contient la méthod intInput() qui s'assure que le nombre entier est bien un int
import be.technifutur.util.Utils;

public class Main {
	public static void main(String[] args) {
		int userChoice = 0;
		MenuFactory menuFactory = new MenuFactory();
		Item[] items = {
				menuFactory.getItemHelloWorld(),
				menuFactory.getItemPermutation(),
				menuFactory.getItemBissextile(),
				menuFactory.getItemFactorial(),
				menuFactory.getItemFirstDegreeEquation(),
				menuFactory.getItemHelloYou()
		};
		
		do {
			// Saisie du choix du l'utilisateur
			do {
				if (userChoice < 0 || userChoice > items.length) {
					System.out.println("Choix invalide!");
				}
			
				System.out.println("Que voulez-vous faire ?");
				System.out.println("(0) Quitter le menu");
				for (int i = 0; i < items.length; i++) {
					System.out.println("(" + (i + 1) + ") " + items[i].getName());
				}
				userChoice = Utils.intInput();
				System.out.println();
			} while (userChoice < 0 || userChoice > items.length);

			// Traitement du choix de l'utilisateur, pour exécuter le programme correspondant
			if (userChoice != 0) {
				items[userChoice - 1].getAction().run();
			}
			
			System.out.println();
		} while (userChoice != 0);
		System.out.println("Fin du programme");
	}
}
