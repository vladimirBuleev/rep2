package tempConverter;

public class CelsiusToFahrenheit extends FahrenheitToCelsius {
    @Override
    public double convert(double c) {
        return c * 1.8 + 32;
    }
}
