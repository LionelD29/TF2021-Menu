package be.technifutur.menu.actions;

import be.technifutur.util.Utils;

public class Somme implements Runnable {
    @Override
    public void run() {
        int a, b;

        System.out.println("Saisir 2 nombres entier");
        a = Utils.intInput();
        b = Utils.intInput();

        System.out.println();
        System.out.println("Somme : " + (a + b));
    }
}
