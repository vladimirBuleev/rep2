package tempConverter;

import java.util.Scanner;

public class UserInputString {
    public String getUserAnswer() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
