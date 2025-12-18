import java.util.Scanner;

public class countdown{
    public static void main(String[] args){
   
       //Scanner used for taking input values from user
       Scanner sc = new Scanner(System.in);
       int countdown = sc.nextInt();
        
       //Create a While Loop for countdown and decrement value
       while(countdown >= 1){

           System.out.println(countdown);
           countdown-- ; 

       }

    }
}

    