import java.util.Scanner;

public class OddEven{
    public static void main(String[] args){
        
        //using Scanner to input values given by the user 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //Checking for Natural number and printing the output Odd/Even
        if(number>0){
            System.out.print("positive");
        }
  
        //Display the result
        for(int i=1 ; i<=number ; i++){
            if(i%2 == 0){
            System.out.println(i + " is EVEN ");
            }
            if(i%2 != 0){
            System.out.println(i + " is ODD ");
            }

        }


    }



}