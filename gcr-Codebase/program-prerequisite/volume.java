import java.util.Scanner;

public class volume{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int radius = sc.nextInt();
    int height = sc.nextInt();
    double volume =( 3.14 * (radius^2) * height);
    
    System.out.println(volume);
    }
}

