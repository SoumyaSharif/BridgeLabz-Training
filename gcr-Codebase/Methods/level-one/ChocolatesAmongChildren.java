import java.util.Scanner;

public class ChocolatesAmongChildren{

    //Create a Children method to calculate how much chocolates each children has
    public static int Children(int n, int y){
        int chocolates =n/y;
        return chocolates;
    }

    //Create a remainder method to calculate remainder chocolates
    public static int Remainder(int n, int y){
        int remainder =n%y;
        return remainder;
    }

    
    public static void main(String[] args){
 
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter chocolates value");
        int chocolates= sc.nextInt();
        System.out.println("Enter number of children ");
        int children = sc.nextInt();

        //Display the result
        System.out.println("The chocolates each children has  " + Children(chocolates,children) + "the remainder of chocolates are " +  Remainder(chocolates,children));
       
    }
}

    