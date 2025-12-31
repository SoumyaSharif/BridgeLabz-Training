/*16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements */

//00:00-00:59 ,01-12,13,14,15,16,17,18,19,20,21,22,23,00:00

import java.util.*; 

public class DigitalWatch{

    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        boolean stop = false ;

        System.out.println("Enter Stop to simulate Power cut");
        outer:
        for(int i=0 ; i <24 ; i++){
            for(int j = 0 ; j<60 ; j++){
                System.out.printf("%02d:%02d%n" , i , j);
                String s = sc.nextLine();

                if(s.equals("stop")){
                 System.out.println("Power cut!");
                 break outer;
                 }
            }
        }
    }
}