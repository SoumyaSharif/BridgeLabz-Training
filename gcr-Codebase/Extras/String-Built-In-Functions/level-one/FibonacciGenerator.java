import java.util.*;

public class FibonacciGenerator{

    //Main Method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();

        //Calling print Method
        printSeries(terms);

    } 

    //Create a Method to print series
    public static void printSeries(int n){  
        int a = 0 , b =1;
        for(int i=0 ; i<= n ;i++){
            System.out.println(a + " " );
            int next = a+b;
            a=b;
            b=next;
        }

    }

}