import java.util.*;

public class SimpleInterest{
    
    //Creating a Method named Calculate
    public static double Calculate(double x , double y , double z ){
        return (x*y*z)/100 ;
    }
    
    public static void main(String[] args){
   
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        double Principal = sc.nextDouble();
        double Rate = sc.nextDouble();
        double Time = sc.nextDouble();
   
        //Calling the function
        double SI = Calculate(Principal , Rate , Time);

        //Display the result
        System.out.println("SimpleInterest is " + SI + " for Principal is " + Principal + "Rate of Interest is " + Rate + "and Time is " + Time );
        
    }
    
}
    

