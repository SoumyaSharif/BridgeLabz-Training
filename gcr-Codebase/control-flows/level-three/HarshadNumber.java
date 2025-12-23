import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {

        //Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //Initialize originalNumber and sum 
        int originalNumber = number;
        int sum = 0;

        //Create a while loop to get sum of each digit
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }

        //Display the results
        if (originalNumber % sum == 0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
    	}
    }
}
