import java.util.Scanner;

public class ZeroNegativeNumbers{
    public static void main(String[] args){
        
        //Create an array to store maximum 10 values
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int sum =0;

        //Taking input from user but terminates when user enters zero or negative number
        for(int i =0 ; i<array.length ; i++){ 
            array[i] = sc.nextInt();
            if(array[i]==0 || array[i] < 0){
                break;
            }   
        }  
 
        //Calculates sum and prints sum and elements in array
        for(int i =0 ; i<array.length ; i++){
             sum = sum + array[i];
        }
        System.out.println(sum);
    }
}