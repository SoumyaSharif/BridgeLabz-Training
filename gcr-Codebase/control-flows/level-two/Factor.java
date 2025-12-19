import java.util.Scanner;

public class Factor{
    public static void main(String[] args){
        
        //using Scanner to input values given by the user 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //Checking for Natural number and printing the output Odd/Even
        if(number>0){
            System.out.print("positive");
            for(int i=1 ; i<= number ; i++){
                if(number%i == 0){
                    System.out.println(number + " is divisible by " + i);
                } 
                else if(number % i != 0){
                    System.out.println(number + " is not divible by " + i);        
                }
            }
        }
    }
}