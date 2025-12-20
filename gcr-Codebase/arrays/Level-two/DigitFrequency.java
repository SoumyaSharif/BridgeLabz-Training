import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Take Input number from the user 
        System.out.print("Enter a number ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;

        //Counting digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Create a loop to Store digits in array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int[] freq = new int[10];
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        //Display the result or frequency
        System.out.println("Digit Frequency");
        for(int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}
