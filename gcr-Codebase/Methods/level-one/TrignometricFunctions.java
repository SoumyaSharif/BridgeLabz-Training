import java.util.Scanner;

public class TrignometricFunctions{

    //Create a method to calculate sum
    public static double[] calculateTrigonometricFunctions(double angle){
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        double tan = Math.tan(angle);

        return new double[]{sin,cos,tan};

    }

    
    public static void main(String[] args){
 
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        double angle= sc.nextInt();

        double[] result =  calculateTrigonometricFunctions(angle);

        //Display the result
        System.out.println("The sin of angle " + result[0] + "The cos of angle " +result[1]+ "The tan of angle is " + result[2]);
       
    }
}

    