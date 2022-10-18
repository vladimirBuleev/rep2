package premiumCalc;

import tempConverter.UserInputString;

public class UserInput extends UserInputString {
    @Override
    public String getUserAnswer() {
        System.out.println("enter your title");
        return super.getUserAnswer();
    }
}
