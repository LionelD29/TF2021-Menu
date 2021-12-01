package be.technifutur.menu.actions;

import be.technifutur.util.Utils;

public class Bissextile {
	public void run() {
		int year = 0;
		
		System.out.println("Saisir une année : ");
		year = Utils.intInput();
		
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println("L'année " + year + " est bissextile");
		} else {
			System.out.println("L'année " + year + " n'est pas bissextile");
		}
	}
}
