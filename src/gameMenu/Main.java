package gameMenu;

import tempConverter.UserInputString;

public class Main {
    public static void main(String[] args) {
        MenuElements.print();

        UserChoice choice = new UserChoice();
        UserInputString answer = new UserInputString();
        ActionOfButton action = new ActionOfButton();
        action.action(choice.userChoice(answer.getUserAnswer()));
    }
}
