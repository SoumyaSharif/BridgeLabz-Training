import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Create a number variable to store number given by user and Create digits array
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int[] temp = new int[maxDigit];
        int index = 0;

        //Loop until number becomes 0 and check if index<<maxindex
        while (number != 0) {

            if (index == maxDigit) {
                maxDigit = maxDigit * 2;              
                for (int i = 0; i <index; i++) {
                    temp[i] = digits[i];
                }

            digits = temp; 
            }

            //store last digit
            digits[index] = number % 10;
            index++;
            number = number / 10;
        }
  
        //Display the results
        System.out.print("Digits: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}

