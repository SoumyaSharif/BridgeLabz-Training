import java.util.Scanner;

public class age_students{
    public static void main(String[] args){
        
        //Create an array to store ages if all 10 students
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        
        //Create a loop to input values from the user
        for(int i=0 ; i< array.length ; i++){
            System.out.print("Enter your values ");
            array[i] = sc.nextInt();
        }
       
        //Create a new loop for checking if age is a negative value or above 18
        for(int i =0 ; i<array.length ; i++){
            if(array[i]<0){
                System.out.println("Invalid age");
            }
            if(array[i]>=18){
                System.out.println("The student with the age " + array[i] +  "can vote.");
            }
            else{
                System.out.println("The student with the age " + array[i] +  "cannot vote.");
            }
        }
    }
}