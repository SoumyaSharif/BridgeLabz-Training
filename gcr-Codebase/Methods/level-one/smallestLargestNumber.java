import java.util.*;

public class smallestLargestNumber{

    //Create a method to check which number is smallest and largest
    public static String Check(int n1 , int n2 , int n3){
        if (n1>n2 && n1>n3){
           System.out.print(n1 + "is the largest");
        }
        else if(n2>n1 && n2>n3){
           System.out.print(n2 + "is the largest"); 
        }
        else if(n3>n1 && n3>n2){
           System.out.print(n3 + "is the largest");
        }
        if(n1<n2 && n1<n3){
          System.out.print(n1 + "is the smallest");
        }
        else if(n2<n1 && n2<n3){
          System.out.print(n2 + "is the smallest");
        }
        else if(n3<n2 && n3<n1){
          System.out.print(n3 + "is the smallest");
        }                   
        return " " ;
    }
    
    public static void main(String[] args){
           
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        int number3= sc.nextInt();

        System.out.println(Check(number1,number2,number3));
        
    }
    
}
    

