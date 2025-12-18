import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Input using Scanner and assign value in Double variable name
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    
    double operation1 = (a + b *c );
    double operation2 = (a * b + c );
    double operation3 = (c + a / b);
    double operation4 = (a % b + c );
        
    //Display the result
    System.out.print("The results of Int Operations are  " + operation1 + " , " + operation2 + " , " + operation3 + " and " + operation4  );
    }
}