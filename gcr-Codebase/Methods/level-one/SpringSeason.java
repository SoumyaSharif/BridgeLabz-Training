import java.util.*;

public class SpringSeason{

    //Create a method to check which month and day is Spring Season
    public static String Check(int month , int day){
        if ((month== 4 || month==5) && day<=31){
           System.out.print("It's Spring Season");
        }
        else if(month == 3 && day >= 20){
           System.out.print("It's Spring Season"); 
        }
        else if (month ==6 && day<= 20){
           System.out.print("It's Spring Season");
        }
        else{
          System.out.print("It's not Spring Season");
        }
        return " " ;
    }
    
    public static void main(String[] args){
           
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        int month= sc.nextInt();
        int day= sc.nextInt();

        System.out.println(Check(month,day));
        
    }
    
}
    

