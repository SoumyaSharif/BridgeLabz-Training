import java.util.*;

public class Distance{

    public static double Rounds(double x ,double y , double z){
        double perimeter = x + y + z;
        double rounds = 5000/perimeter ;
        return rounds;
    }
    
    public static void main(String[] args){
           
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        double Perpendicular = sc.nextInt();
        double Base = sc.nextInt();
        double Height = sc.nextInt();
       
        Rounds(Perpendicular, Base, Height);

        System.out.println("The rounds taken to complete 5km distance is  " +  Rounds(Perpendicular, Base, Height));
        
    }
    
}
    

