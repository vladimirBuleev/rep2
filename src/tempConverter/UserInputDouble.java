package tempConverter;
import java.util.Scanner;
public class UserInputDouble extends UserInputString {
    double getUserValue(){
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
