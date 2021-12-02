package be.technifutur.menu;

import java.util.ArrayList;

public class MenuModel {
    private final ArrayList<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public Item getItem(int pos) {
        Item item;
        if (pos >= 0 && pos < itemList.size()) {
            item = itemList.get(pos);
        } else {
            item = null;
        }
        return item;
    }

    public int size() {
        return itemList.size();
    }
}
