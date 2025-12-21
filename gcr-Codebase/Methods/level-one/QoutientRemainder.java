import java.util.Scanner;

public class QoutientRemainder{

    //Create a quotient method to calculate sum
    public static int Quotient(int n, int y){
        int quotient =n/y;
        return quotient;
    }

    //Create a remainder method to calculate sum
    public static int Remainder(int n, int y){
        int remainder =n%y;
        return remainder;
    }

    
    public static void main(String[] args){
 
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        int number1= sc.nextInt();
        int number2 = sc.nextInt();

        //Display the result
        System.out.println("The quotient of numbers are  " + Quotient(number1,number2) + "the remainder of numbers" +  Remainder(number1,number2));
       
    }
}

    