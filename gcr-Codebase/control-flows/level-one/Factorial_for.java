import java.util.Scanner;

public class Factorial_for{
    public static void main(String[] args){
   
    //Input given by the user
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int factorial = 1 ;

    //if the number is positive then perform the while loop
    if(n>0){
        System.out.println("Positive Number");
        for(int i=1 ; i<=n ; i++ ){
            factorial = factorial * i ;   
        }
        System.out.print(factorial);
    }
    else{
        System.out.print("negative Number");
    }
     

    }
}