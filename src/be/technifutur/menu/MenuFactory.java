package be.technifutur.menu;

import be.technifutur.menu.actions.*;

public class MenuFactory {
    public MenuController getMenu() {
        return createMenu(getModelPrincipal());
    }

    private MenuNode getItemExit() {
        return createItem("Quitter le programme", null);
    }

    public MenuNode getItemHelloWorld() {
        return createItem("Hello world", new Helloworld());
    }

    public MenuNode getItemPermutation() {
        return createItem("Permutation de 2 nombres", new Permutation());
    }

    public MenuNode getItemBissextile() {
        return createItem("Vérifier si une année est bissextile", new Bissextile());
    }

    public MenuNode getItemFactorial() {
        return createItem("Calculer une factorielle", new Factorial());
    }

    public MenuNode getItemFirstDegreeEquation() {
        return createItem("Résoudre une équation du premier degré", new FirstDegreeEquation());
    }

    public MenuNode getItemHelloYou() {
        return createItem("Demander au programme de vous dire bonjour", new HelloYou());
    }

    private MenuNode createItem(String name, Runnable action) {
        Item item = new Item();
        item.setName(name);
        item.setAction(action);
        return item;
    }

    private MenuController createMenu(MenuModel model) {
        MenuController menu = new MenuController();
        menu.setModel(model);
        menu.setView(new MenuView());
        return menu;
    }

    // Définition des menus et sous-menus
    private MenuModel getModelPrincipal() {
        MenuModel model = new MenuModel("Menu principal");
        model.addNode(getItemExit());
        model.addNode(getItemHelloWorld());
        model.addNode(getItemHelloYou());
        model.addNode(createMenu(getModelExercises()));
        return model;
    }

    private MenuModel getModelExercises() {
        MenuModel model = new MenuModel("Exercices");
        model.addNode(getItemExit());
        model.addNode(getItemBissextile());
        model.addNode(getItemFactorial());
        model.addNode(getItemFirstDegreeEquation());
        model.addNode(getItemPermutation());
        return model;
    }

}
