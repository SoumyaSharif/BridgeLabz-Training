import java.util.Scanner;

public class countdown_for{
    public static void main(String[] args){
   
       //Scanner used for taking input values from user
       Scanner sc = new Scanner(System.in);
       int countdown = sc.nextInt();
        
       //Create a for loop for countdown
       for(int i=countdown ; i>0 ; i--){
           System.out.println(i);
           
       }

    }
}

    