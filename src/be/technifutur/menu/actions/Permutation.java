package be.technifutur.menu.actions;

import be.technifutur.util.Utils;

public class Permutation implements Runnable{
	@Override
	public void run() {
		int tmp, x, y;
		
		System.out.println("Saisir 2 variables à permuter : ");
		x = Utils.intInput();
		y = Utils.intInput();
		System.out.println();

		System.out.println("Avant permutation : ");
		System.out.println("X = " + x + ", Y = " + y);
		
		tmp = x;
		x = y;
		y = tmp;

		System.out.println("Après permutation : ");
		System.out.println("X = " + x + ", Y = " + y);
	}
}
