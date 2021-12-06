package be.technifutur.menu;

public class Main {
	public static void main(String[] args) {
		MenuFactory factory = new MenuFactory();
		MenuControler controler = factory.getMenu();
		Runnable action = controler.getAction();

		while (action != null) {
			action.run();
			action = controler.getAction();
		}

		MenuVue.exit();
	}
}
