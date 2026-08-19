package week2.day7.hackerrankquestions;

import java.util.Scanner;

public class FibonacciNumbers {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Fibonnacci(n));

    }

    public static int Fibonnacci(int n){

        if(n==0){
            return 0 ;
        }
        else if (n==1){
            return 1 ;
        }

        //method call
        int result = Fibonnacci(n-1) + Fibonnacci(n-2);

        return result ;

    }
}
