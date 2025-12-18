import java.util.Scanner;

public class divisibility{
    public static void main(String[] args){
   
    //Scanner used for taking input values from user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
  
    //Display the results , Since a boolean expression , output is true or false.
    System.out.print( " is the number " + number + " divisible by 5? " + (number%5 == 0));
    }
}

    