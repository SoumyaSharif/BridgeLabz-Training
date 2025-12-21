import java.util.*;

public class CheckPositiveNegativeZero{

    //Create a method to check positive , negative , zero
    public static int Check(int n){
        if(n == 0){
            return 0;
        }
        else if(n>0){
           return 1;
        }
        else if(n<0){
            return -1;
        }
        return 0;
    }
    
    public static void main(String[] args){
           
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();

        System.out.println("The number is  " + Check(number));
        
    }
    
}
    

