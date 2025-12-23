import java.util.Scanner;

public class BMICheck {

    public static void main(String[] args) {
       
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight ");
        double weight = sc.nextDouble();
        System.out.print("Enter height ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        //Print the BMI
        System.out.println("BMI = " + bmi);

        //Display the results 
        if (bmi < 18.5){
            System.out.println("Underweight"); 
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if (bmi < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
