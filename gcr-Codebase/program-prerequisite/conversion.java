import java.util.Scanner;

public class conversion{
    public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    int cel = sc.nextInt();
    int fahren = ((cel * 9/5) + 32); 
    
    System.out.println(fahren);
    }
}
    


