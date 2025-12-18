import java.util.Scanner;

public class SpringSeason{
    public static void main(String[] args){
   
       //Scanner used for taking input values from user
       Scanner sc = new Scanner(System.in);
       int month = sc.nextInt();
       int day = sc.nextInt();
       
        //if the month is between march 20 and June 20 , then output is "it's Spring Season"
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

    }
}

    