import java.util.Scanner;

public class Check{
    public static void main(String[] args){
   
       //Scanner used for taking input values from user
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();

       //if the number is positive , output is "positive"
       if(number>0){
           System.out.print("positive");
       }
       //if the number is negative , output is "negative"
       if(number<0){
           System.out.print("negative");
       }
       //if the number is 0, output is "zero"
       if(number==0){
           System.out.print("zero");
       } 

    }
}

    