import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        //Take input from user 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //Initializing the originalNumber and sum
        int originalNumber = number;
        int sum = 0;

        //Create a while loop 
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber = originalNumber / 10;
        }
 
        //Display the results 
        if (sum == number){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
