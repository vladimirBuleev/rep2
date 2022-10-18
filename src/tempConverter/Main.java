package tempConverter;

public class Main {
    public static void main(String[] args) {
        Converter conv = new Converter();
        UserInputString answer = new UserInputString();
        System.out.println("enter FtoC or CtoF");
        conv.converter(answer.getUserAnswer());
    }
}
