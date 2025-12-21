public class UnitConvertor2 {

    // a. Yards to Feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // b. Feet to Yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // c. Meters to Inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // d. Inches to Meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // e. Inches to Centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Main method for testing
    public static void main(String[] args) {

        System.out.println("Yards to Feet: " + convertYardsToFeet(5));
        System.out.println("Feet to Yards: " + convertFeetToYards(15));
        System.out.println("Meters to Inches: " + convertMetersToInches(2));
        System.out.println("Inches to Meters: " + convertInchesToMeters(78.74));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(10));
    }
}
