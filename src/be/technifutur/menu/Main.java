package be.technifutur.menu;

public class Main {
	public static void main(String[] args) {
		MenuFactory factory = new MenuFactory();
		MenuControler controler = factory.getMenu();
		Runnable action;

		do {
			action = controler.getAction();
			if (action != null) {
				action.run();
			}
		} while (action != null);

		MenuVue.exit();
	}
}
