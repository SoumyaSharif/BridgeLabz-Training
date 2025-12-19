import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
        
        //using Scanner to input values given by the user 
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //Checking for Natural number and printing the output Odd/Even
        if(year%4 == 0 && year%100 != 0){
           System.out.println("It's a Leap year"); 
        }
        else if (year%400 == 0){
            System.out.println("It's a Leap year");
        } 
        else{
            System.out.println("It's not a Leap year");
        }   
    }
}