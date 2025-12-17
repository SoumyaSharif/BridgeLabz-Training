import java.util.Scanner;
public class Handshakes{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Input using Scanner and assign value in Integer variable name
    int numberOfStudents = sc.nextInt();
    int maxHandshakes = (numberOfStudents * (numberOfStudents-1))/2; 
        
    //Display the result
    System.out.print("  the number of possible handshakes are " + maxHandshakes);

    }
}