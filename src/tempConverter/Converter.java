package tempConverter;

public class Converter {
    String answer;

    protected void converter(String answer) {
        FahrenheitToCelsius temp = new FahrenheitToCelsius();
        CelsiusToFahrenheit temp1 = new CelsiusToFahrenheit();
        UserInputDouble value = new UserInputDouble();
        this.answer = answer;
        if (answer.equalsIgnoreCase("fToC")) {
            System.out.println("enter value");
            System.out.println(temp.convert(value.getUserValue()) + " C");
        } else if (answer.equalsIgnoreCase("CtoF")) {
            System.out.println("enter value");
            System.out.println(temp1.convert(value.getUserValue()) + " F");
        } else {
            System.out.println("wrong answer");
        }
    }
}
