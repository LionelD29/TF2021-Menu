package be.technifutur.menu;

import java.util.ArrayList;

public class MenuModel {
    private final ArrayList<MenuNode> menuNodeList = new ArrayList<>();
    // private String name;

    // TODO ajouter un constructeur qui prend en paramètre un name et qui l'attribue à l'attribut privé name

    public void addNode(MenuNode menuNode) {
        menuNodeList.add(menuNode);
    }

    public MenuNode getNode(int pos) {
        MenuNode menuNode;
        if (pos >= 0 && pos < menuNodeList.size()) {
            menuNode = menuNodeList.get(pos);
        } else {
            menuNode = null;
        }
        return menuNode;
    }

    // TODO implémenter la méthode String getName() qui donne le nom du MenuNode


    public int size() {
        return menuNodeList.size();
    }
}
