package be.technifutur.menu;

import be.technifutur.menu.actions.*;

public class MenuFactory {
    public Item getItemHelloWorld() {
        return createItem("Hello world", new Helloworld());
    }

    public Item getItemPermutation() {
        return createItem("Permutation de 2 nombres", new Permutation());
    }

    public Item getItemBissextile() {
        return createItem("Vérifier si une année est bissextile", new Bissextile());
    }

    public Item getItemFactorial() {
        return createItem("Calculer une factorielle", new Factorial());
    }

    public Item getItemFirstDegreeEquation() {
        return createItem("Résoudre une équation du premier degré", new FirstDegreeEquation());
    }

    public Item getItemHelloYou() {
        return createItem("Demander au programme de vous dire bonjour", new HelloYou());
    }

    private Item createItem(String name, Runnable action) {
        Item item = new Item();
        item.setName(name);
        item.setAction(action);
        return item;
    }
}
