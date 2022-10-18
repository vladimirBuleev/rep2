package premiumCalc;

public class Premium {
    final int premiumAmount = 1000000;

    public double Premium(Employees stuff) {
        if (stuff == Employees.WORKER) {
            return premiumAmount * 0.1;
        } else if (stuff == Employees.DIRECTOR) {
            return premiumAmount * 0.5;
        } else if (stuff == Employees.ASSISTANT) {
            return premiumAmount * 0.2;
        } else {
            return 0;
        }
    }
}
