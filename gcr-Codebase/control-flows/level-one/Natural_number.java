import java.util.Scanner;

public class Natural_number{
    public static void main(String[] args){
   
    //Scanner used for taking input values from user
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    
    //using formula for sum of natural numbers
    int sum = number*(number+1)/2;
  
    //Display the results 
    System.out.print("The sum of " + number + " natural numbers is " + sum + " Otherwise The number " + number + " is not a natural number ");

    }
}

    