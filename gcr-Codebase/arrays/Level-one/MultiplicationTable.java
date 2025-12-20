import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        
        //Create an array to store ages if all 10 students
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[10];
        int n = 1;
       
        //Create a for loop to store values in array and then print output 
        for(int i=0 ; i< array.length ; i++){
            while(n<=10){
                array[i] = n*number ;
                System.out.println(number + "*" + i + "=" + array[i]);
                n++ ;
            } 
        
        }
    }
}