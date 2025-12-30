import java.util.Scanner;

public class TemperatureLogger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int DAYS = 7;
        double[] temperatures = new double[DAYS];

        double sum = 0;
        double maxTemp;

        // Input temperatures using for-loop
        for (int i = 0; i < DAYS; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = sc.nextDouble();
        }

        maxTemp = temperatures[0];

        // Calculate sum and max temperature
        for (int i = 0; i < DAYS; i++) {
            sum += temperatures[i];

            if (temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];
            }
        }

        double average = sum / DAYS;

        System.out.println("\nAverage Temperature: " + average);
        System.out.println("Maximum Temperature: " + maxTemp);
    }
}
