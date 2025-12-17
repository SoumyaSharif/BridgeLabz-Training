import java.util.Scanner;
public class TotalPrice{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Input using Scanner and assign value in Integer variable name
    int unitPrice = sc.nextInt();
    int quantity = sc.nextInt();
    int totalPrice = unitPrice * quantity; 
        
    //Display the result
    System.out.print(" The total purchase price is INR" +totalPrice + "if the quantity" +  quantity + "and unit price is INR " + unitPrice);

    }
}