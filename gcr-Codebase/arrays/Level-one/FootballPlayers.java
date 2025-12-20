import java.util.Scanner;

public class FootballPlayers{
    public static void main(String[] args){
        
        //Create an array to store maximum 11 values
        Scanner sc = new Scanner(System.in);
        double[] array = new double[11];
        double sum = 0;
        
        //Create for loop to input value of array elements.
        for(int i=0 ; i< array.length ; i++){
            array[i] = sc.nextDouble();
            sum = sum + array[i];
        }

        //Display the result 
        System.out.println("the mean of the heights of football players are " + (sum/11) + "the sum of the heights of football players are " + sum);
               
    }
}