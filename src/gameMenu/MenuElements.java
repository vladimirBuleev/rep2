package gameMenu;

public enum MenuElements {
	NEW_GAME, CONTINUE, LOAD_GAME, OPTION, EXIT;

	public static void print() {
		for (int i = 0; i < values().length; i++) {
			System.out.println(values()[i]);
		}
	}
}
