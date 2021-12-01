package be.technifutur.menu.actions;

import be.technifutur.util.Utils;

public class Permutation {

	public void run() {
		int tmp = 0, x = 0, y = 0;
		
		System.out.println("Saisir 2 variables à permuter : ");
		x = Utils.intInput();
		y = Utils.intInput();
		System.out.println();
		
		
		System.out.println("X = " + x + ", Y = " + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println();
		System.out.println("Après permutation : ");
		System.out.println("X = " + x + ", Y = " + y);
	}
}
