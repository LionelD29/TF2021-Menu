package be.technifutur.menu;

import java.util.Scanner;

public class MenuVue {
    private final Scanner input = new Scanner(System.in);

    public String saisirMenu(MenuModel menu) {
        String choice;

        // print the menu
        System.out.println();
        System.out.println("Que voulez-vous faire ?");
        for(int i = 0; i < menu.size(); i++) {
            System.out.printf("(%2d) %s%n", i, menu.getNode(i).getName());
        }

        // user input
        System.out.print("Choix : ");
        choice = input.nextLine();
        System.out.println();

        return choice;
    }



    public static void exit() {
        System.out.println("Fin du programme");
    }

    public void invalidInput() {
        System.out.println("Mauvaise saisie !");
    }
}
