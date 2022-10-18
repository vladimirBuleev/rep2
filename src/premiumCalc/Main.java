package premiumCalc;

import tempConverter.UserInputString;

public class Main {
    public static void main(String[] args) {
        Initialization inz = new Initialization();
        UserInput answer = new UserInput();
        Premium prem = new Premium();
        System.out.println(prem.Premium(inz.Initialization(answer.getUserAnswer())));
    }
}
