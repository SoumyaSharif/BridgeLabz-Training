import java.util.Scanner;
public class area_triangle{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Input using Scanner and assign value in double variable name
    double base = sc.nextDouble();
    double height = sc.nextDouble();
    double area = 1/2 * base * height ;
    double inches = height /2.54;
    double feet = height /12 ;    

    //Display the result
    System.out.print(" Your Height in cm is " + height + " while in feet is " +feet+ " and inches is " + inches);

    }
}