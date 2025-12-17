import java.util.Scanner;
public class StudentFee{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Input using Scanner and assign value in double variable name
    int StudentFee = sc.nextInt();
    int DiscountPercent = sc.nextInt();
    int discount = (StudentFee * DiscountPercent )/100;
    int finalFee = StudentFee - discount;
    
    //Display the result
    System.out.print(" The discount amount is INR  " + discount + " and final discounted fee is INR " + finalFee);

    }
}