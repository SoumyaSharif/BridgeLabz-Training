import java.util.Scanner;

public class CompareNumbers{
    public static void main(String[] args){
        
        //Create an array to store ages if all 5 numbers
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        
        //Create a loop to input values from the user
        for(int i=0 ; i< array.length ; i++){
            System.out.print("Enter your values ");
            array[i] = sc.nextInt();
        }
       
        //Create a new loop for checking if the numbers are positive , negative or zero
        for(int i =0 ; i<array.length ; i++){
            if(array[i]>0){
                System.out.println("Positive");
                if(array[i]%2 == 0){
                    System.out.println("EVEN");
                }
                else if(array[i]%2 != 0){
                    System.out.println("ODD");
                }
                else if(array[i]==0){
                    System.out.println("ZERO");
                }

            }
        }
            if(array[0] == array[array.length-1]){
                System.out.println("The elements of array are equal");
            }
            else if(array[0] > array[array.length-1]){
                System.out.println(array[0] + " is greater than " + array[array.length-1]);
            }
            else if(array[0] < array[array.length-1]){
                System.out.println(array[array.length-1] + " is greater than " + array[0]);
            }   
    }
}