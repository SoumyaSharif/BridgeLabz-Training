public class UnitConvertor {

    // a. Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // b. Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // c. Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // d. Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // e. Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // f. Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method for testing
    public static void main(String[] args) {

        System.out.println("Fahrenheit to Celsius: " +
                convertFahrenheitToCelsius(98.6));

        System.out.println("Celsius to Fahrenheit: " +
                convertCelsiusToFahrenheit(37));

        System.out.println("Pounds to Kilograms: " +
                convertPoundsToKilograms(10));

        System.out.println("Kilograms to Pounds: " +
                convertKilogramsToPounds(5));

        System.out.println("Gallons to Liters: " +
                convertGallonsToLiters(2));

        System.out.println("Liters to Gallons: " +
                convertLitersToGallons(5));
    }
}
