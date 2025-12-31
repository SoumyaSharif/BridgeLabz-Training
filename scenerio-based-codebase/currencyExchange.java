/*18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/

import java.util.*;

public class currencyExchange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the amount of money in INR ");
        double input = sc.nextInt();

        sc.nextLine();
        System.out.println("It Can convert in Canadian dollar , dollar , Nepali rupay , AED : ");

        String Currency = sc.nextLine();

        for(int i=0 ; i<=5 ; i++){
        switch(Currency.toLowerCase()) {
            case("canadian dollar") : {
                input = input *.015 ;
            }

            case("dollar") : {
                input = input * .011 ;
            }

            case("nepali rupay") : {
                input = input *1.60;
            }

            case("aed") : {
                input = input * .041 ;
            }
        }
    }
        System.out.println("The amount in : " + Currency  + " is " + input);
    } 
}
