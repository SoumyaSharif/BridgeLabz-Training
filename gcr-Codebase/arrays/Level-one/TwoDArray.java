import java.util.*;
public class TwoDArray{
    public static void main(String[] args){
        
        //Input given by the user 
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[] SingleArray = new int[row*column];
        int[][] DoubleArray = new int[row][column];

        //code to take input from user for 2d array
        for(int i =0 ; i<row ; i++){
            for(int j =0 ; j<column ; j++){
                DoubleArray[i][j] = sc.nextInt();
            }

        }

        //copy elements from 2d array to 1d array
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                SingleArray[index] = DoubleArray[i][j];
                index++;
            }
        }

        // Print 1D array
        for (int i = 0; i < SingleArray.length; i++) {
            System.out.print(SingleArray[i] + " ");
        }
    }
}
    