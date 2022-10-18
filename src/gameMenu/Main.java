package gameMenu;

import tempConverter.UserInputString;

public class Main {
    public static void main(String[] args) {
        MenuElements[] menu = MenuElements.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        UserChoice choice = new UserChoice();
        UserInputString answer = new UserInputString();
        ActionOfButton action = new ActionOfButton();
        action.action(choice.userChoice(answer.getUserAnswer()));
    }
}
