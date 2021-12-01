package be.technifutur.menu.actions;

import be.technifutur.util.Utils;

public class Factorial implements Runnable {
	@Override
	public void run() {
		int factorial = 1, num = 0, factor = 0;
		
		do {
			if (num < 0) {
				System.out.println("Le nombre doit être positif");
				System.out.println();
			}
			
			System.out.println("Choisir un nombre entier positif: ");
			num = Utils.intInput();
		} while(num < 0);
		
		factor = num;
		while (factor >= 2) {
			factorial *= factor;
			factor--;
		}
		
		System.out.println("La factorielle de " + num + " vaut " + factorial);
	}
}