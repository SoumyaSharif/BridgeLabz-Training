import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
 
        //Take input from the user 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;
 
        //Create a while loop to count the digits
        while (number != 0) {
            number = number / 10;
            count++;
        }

        //Display the results 
        System.out.println("Number of digits: " + count);
    }
}
