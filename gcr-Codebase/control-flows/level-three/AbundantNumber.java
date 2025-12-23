import java.util.Scanner;

public class AbundantNumber{

    public static void main(String[] args){

        //Taking input from the user 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = sc.nextInt();
        int sum = 0;

        //Create for loop to check the condition
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        //Display the results
        if (sum > number){
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not an Abundant Number");
        }

    }
}
