import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Input using Scanner and assign value in Integer variable name
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int operation1 = a + b *c;
    int operation2 = a * b + c;
    int operation3 =  c + a / b;
    int operation4 =  a % b + c ;
        
    //Display the result
    System.out.print("The results of Int Operations are  " + operation1 + " " + operation 2 + " " + operation3 + "and " + operation4  );
    }
}