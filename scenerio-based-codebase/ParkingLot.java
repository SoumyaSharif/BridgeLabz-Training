import java.util.* ;

public class ParkingLot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any one of the three options : 1.Park 2.Exit 3.Space occupied ");
        String User = sc.nextLine();
        System.out.println("Enter Number of Spaces in parking Lot");
        int SpaceForParking = sc.nextInt(); 
      
        switch(User.toLowerCase){
            
            case("park"){
                if(SpaceForParking == 0){
                    System.out.println("Parking Lot is Full . Try next time ");
                }
                
                System.out.println("There's a Slot!");
                SpaceForParking-- ;
                break;
            }
            case("Exit"){
                if(SpaceForParking == 0){

                   System.out.println("");
 
                }
            }
            

        }


    }



}