package be.technifutur.menu;

public class Main {
	public static void main(String[] args) {
		MenuFactory factory = new MenuFactory();
		MenuController controller = factory.getMenu();
		Runnable action = controller.getAction();

		while (action != null) {
			action.run();
			action = controller.getAction();
		}
	}
}
