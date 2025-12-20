import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Take input from the user
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        //Create a loop to Input weight and height.
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Weight");
            weight[i] = sc.nextDouble();

            System.out.print("Height");
            height[i] = sc.nextDouble();
        }

        //Calculate BMI and weight status
        for (int i=0 ; i<n ; i++){
            bmi[i] = weight[i] / (height[i] * height[i]);
            if(bmi[i] <= 18.4){
                System.out.println("Underweight");
            }
            else if(bmi[i] >= 18.5 && bmi[i] <=24.9){
                System.out.println("Normal");
            }
            else if(bmi[i] >= 25.0 && bmi[i] <=39.9){
                System.out.println("Overweight");
            }
            else if(bmi[i] >= 40.0){
                System.out.println("Obese");
            }

        } 
    }
}