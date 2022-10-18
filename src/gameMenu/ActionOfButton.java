package gameMenu;

import tempConverter.UserInputString;

public class ActionOfButton {
    public void action(MenuElements menu) {
        if (menu == null) {
            System.out.println("wrong answer");
            return;
        }
        System.out.println("Вы выбрали " + menu);
        UserChoice choice = new UserChoice();
        UserInputString answer = new UserInputString();
        ActionOfButton action = new ActionOfButton();
        action.action(choice.userChoice(answer.getUserAnswer()));
    }
}
