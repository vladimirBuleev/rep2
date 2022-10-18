package gameMenu;

import tempConverter.UserInputString;

public class UserChoice {

    protected MenuElements userChoice(String answer) {
        if (answer.equalsIgnoreCase("new game")) {
            return MenuElements.NEW_GAME;
        } else if (answer.equalsIgnoreCase("load game")) {
            return MenuElements.LOAD_GAME;
        } else if (answer.equalsIgnoreCase("continue")) {
            return MenuElements.CONTINUE;
        } else if (answer.equalsIgnoreCase("option")) {
            return MenuElements.OPTION;
        } else if (answer.equalsIgnoreCase("exit")) {
            return MenuElements.EXIT;
        } else {
            return null;

        }
    }
}
