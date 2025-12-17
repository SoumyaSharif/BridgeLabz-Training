import java.util.Scanner;
public class SideOfSquare{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Input using Scanner and assign value in Integer variable name
    int perimeter = sc.nextInt(); 
    int side = perimeter/4;
    
    //Display the result
    System.out.print(" The length of the side is " + side + "whose perimeter is " + perimeter);

    }
}