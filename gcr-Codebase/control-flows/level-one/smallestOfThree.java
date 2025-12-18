import java.util.Scanner;

public class smallestOfThree{
    public static void main(String[] args){
   
    //Scanner used for taking input values from user
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    int number3 = sc.nextInt();


    //(+) is evaluated before (&&), so Java gets confused and expects ')' .
    //Display the results , Since a boolean expression , output is true or false.
    System.out.print( " is the first number the smallest ? " + ((number1 < number2) && (number1 < number3)));
    }
}

    