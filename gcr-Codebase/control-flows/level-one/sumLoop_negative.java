import java.util.Scanner;

public class sumLoop_negative{
    public static void main(String[] args){
   
       //Scanner used for taking input values from user
       Scanner sc = new Scanner(System.in);
       double n = sc.nextDouble();
       double total = 0.0;
       
       //Create a while loop for sum of numbers
       while(n!=0 && n>0){

           total = total + n ;
           System.out.println("Input the next digit or Enter 0 or a negative number to end ");
           n = sc.nextDouble();

       }
       
       //Display the result
       System.out.print(total);
    }
}

    