import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {

        // Scanner to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Create a for loop to take the input of person's weight and height.
        for(int i = 0; i < number; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height (meters): ");
            personData[i][1] = sc.nextDouble();

            // Print invalid message if the input is negative.
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input!");
                i--;
            }
        }

        // Storing BMI and weight of the persons into the 2D array
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            personData[i][2] = weight / (height * height);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        //Display the Results
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m" );
            System.out.println("BMI: " + personData[i][2] );
        }

    }
}