package be.technifutur.menu;

public class MenuControler {
    private MenuModel model;
    private MenuVue vue;

    public void setModel(MenuModel model) {
        this.model = model;
    }

    public void setVue(MenuVue vue) {
        this.vue = vue;
    }

    public Runnable getAction() {
        int position = 0;
        boolean isValid = false;
        Runnable action = null;
        Item item;

        while (!isValid) {
            try {
                // get the user choice
                String userChoice = this.vue.saisirMenu(this.model);

                // transform the choice into a position
                position = Integer.parseInt(userChoice);
                action = this.model.getItem(position).getAction();
                isValid = true;
            } catch(Exception e) {
                this.vue.invalidInput();
            }
        }

        return action;
    }
}
