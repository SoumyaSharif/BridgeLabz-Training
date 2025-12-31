/*19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/

import java.util.*;

public class busRoute {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int distance = 0 ;
        System.out.println("Do any of the passengers wants to get off at the next stop ?");
        
        Random random = new Random();

        for(int i=0 ; i<=10 ; i++){
        String input = sc.nextLine();
        if(input.equals("yes")){
            System.out.println("the total distance covered is " + distance);
            System.out.println("Are you sure you want to exit?");
            String confirm = sc.nextLine();
            if(confirm.equals("yes")){
                System.out.println("The total distance covered is " + distance + "km");
                return;
            }
            else{
            System.out.println("\nNext Stop Arrived\nDo any of the passengers wants to get off at the next stop ?");
            input = sc.nextLine();
            }
        }
        System.out.println("Next Stop Arrived , Do you want to get off? ");
        distance = distance + random.nextInt(30) ;
            continue;
        }
        
    }
    
}
