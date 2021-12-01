package be.technifutur.menu.actions;

import java.util.Scanner;

public class HelloYou implements Runnable {
    @Override
    public void run() {
        String firstName = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Quel est votre prénom : ");
        firstName = scan.nextLine();

        System.out.println("Hello " + firstName);
    }
}
