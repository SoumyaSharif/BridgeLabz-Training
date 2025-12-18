import java.util.Scanner;

public class SumCompare_for{
    public static void main(String[] args){
   
       //Scanner used for taking input values from user
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int total = 0;
       int total_formula =n*(n+1)/2;
       
       //if input number is a natural number then get sum from total and compare from formula
       if(n>=0){
           System.out.println("Natural Number"); 

           for(int i =n ; i>=0 ; i--){
               total = total + i;
           } 
          
           if(total == total_formula){
               System.out.print("sum from total " + total + " is equal to " + total_formula );
           }
       }      
    }
}

    