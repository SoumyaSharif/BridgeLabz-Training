import java.util.Scanner;

public class SumOfNaturalNumbers{

    //Create a method to calculate sum
    public static int Sum(int n){
        int sum =(n *(n+1))/2;
        return sum;
    }

    
    public static void main(String[] args){
 
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();

        //Display the result
        System.out.println("The sum of n numbers are  " + Sum(number));
       
    }
}

    