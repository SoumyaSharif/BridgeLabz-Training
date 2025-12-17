import java.util.Scanner;
public class Convert_km_mile{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Input using Scanner and assign value in double variable name
    double km = sc.nextDouble();
    double convertedMile = km/1.6 ;
    
    //Display the result
    System.out.print("The total miles is " + convertedMile + " mile for the given " + km);

    }
}