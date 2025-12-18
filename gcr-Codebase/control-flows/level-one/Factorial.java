import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
   
    //Input given by the user
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int factorial = 1 ;

    //if the number is positive then perform the while loop
    if(n>0){
        System.out.println("Positive Number");

        while(n>0){
            factorial = factorial * n ;
            n-- ;
        }
        System.out.print(factorial);
    }
    else{
        System.out.print("negative Number");
    }
     
    }
}