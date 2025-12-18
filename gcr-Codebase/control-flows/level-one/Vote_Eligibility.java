import java.util.Scanner;

public class Vote_Eligibility{
    public static void main(String[] args){
   
       //Scanner used for taking input values from user
       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();

       //if age of the person is 18 or older , output is "can vote"
       if(age >= 18){
         System.out.println(" The person can vote " );
       }
       //if age of the person is not 18 or older , output is "cannot vote"
       else{
         System.out.println(" The person cannot vote " );
       }

    }
}

    