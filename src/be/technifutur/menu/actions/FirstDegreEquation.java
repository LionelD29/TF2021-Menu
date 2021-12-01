package be.technifutur.menu.actions;

import be.technifutur.util.Utils;

public class FirstDegreEquation implements Runnable {
	@Override
	public void run() {
		int a = 0, b = 0;
		
		System.out.println("Equation de type ax + b = 0");
		System.out.println("Choisir a et b (entiers) : ");
		
		a = Utils.intInput();
		b = Utils.intInput();
		
		if (a != 0) {
			System.out.println("x = " + (-b / a));
		} else if (b != 0) {
			System.out.println("Solution impossible");
		} else {
			System.out.println("Solution indéterminée");
		}
		
	}
}