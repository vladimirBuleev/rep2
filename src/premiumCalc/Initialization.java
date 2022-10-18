package premiumCalc;

import tempConverter.UserInputString;

public class Initialization {
    public Employees Initialization(String answer) {
        if (answer.equalsIgnoreCase("director")) {
            return Employees.DIRECTOR;
        } else if (answer.equalsIgnoreCase("assistant")) {
            return Employees.ASSISTANT;
        } else if (answer.equalsIgnoreCase("worker")) {
            return Employees.WORKER;
        } else {
            System.out.println("wrong answer");
            return null;
        }
    }


}
