// WAP using lambda expressions in Java to calculate the following.
// 1. Convert Fahrenheit to Celsius.
// 2. Convert Kilometers to Miles.

interface FahrenheitToCelsius {
    double convert(double fahrenheit);
}

interface KilometersToMiles {
    double convert(double kilometers);
}
class Calculate {
    public static void main(String[] args) {
        // 1. Convert Fahrenheit to Celsius.
        FahrenheitToCelsius convertToCelsius = (fahrenheit) -> (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit to Celsius: " + convertToCelsius.convert(104));

        // 2. Convert Kilometers to Miles.
        KilometersToMiles convertToMiles = (kilometers) -> kilometers * 0.621371;
        System.out.println("Kilometers to Miles: " + convertToMiles.convert(100));
    }
}
