import java.util.Scanner;
public class Height{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Input using Scanner and assign value in double variable name
    double height = sc.nextInt();
    double inches = height /2.54 ;
    double feet = inches /12;
    
    
    //Display the result
    System.out.print("Your Height in cm is" + height + "while in feet is" + feet + "and inches is" + inches);

    }
}