import java.util.Scanner;
public class distance_conversion{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Input using Scanner and assign value in double variable name
    double distanceInFeet =sc.nextInt();
    double miles = distanceInFeet /5280 ;
    double yard = distanceInFeet/3;
        
    //Display the result
    System.out.print("Your distance in feet is" + distanceInFeet + "while in miles is " + miles + " and in yards is " + yard );
    }
}