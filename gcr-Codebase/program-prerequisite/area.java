import java.util.Scanner;

public class area{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int radius = sc.nextInt();
    double area =( 3.14 * (radius^2));
    
    System.out.println(area);
    }
}

