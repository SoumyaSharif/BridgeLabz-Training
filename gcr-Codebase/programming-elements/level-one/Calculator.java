import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Input using Scanner and assign value in double variable name
    float number1 = sc.nextFloat();
    float number2 = sc.nextFloat(); 
    
    //Create variable names for formulas
    double addition = number1 + number2 ;
    double substraction = number1 - number2 ;
    double multiplication = number1 * number2;
    double division = number1 / number2 ; 
    
    //Display the result
    System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + substraction + multiplication +" and "+ division );

    }
}