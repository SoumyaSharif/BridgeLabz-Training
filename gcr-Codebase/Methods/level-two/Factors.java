import java.util.*;

public class Factors{
    public static void main(String[] args){
    
    //Take input from the user 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] CountofFactors = new int[n];
    CountofFactors[] = Factor(n);
    sum(CountofFactors[]);
    SquareSum(CountofFactors[]);

    System.out.println("The number of factors are " +CounttoFactors+ " The sum is " + sum(CountofFactors[]) + " and the Square sum is " + SquareSum(CountofFactors[]) );

    }

    public static int[] Factor(int n){
        int[] count = new int[n]
        int index = 0;
        for(int i =0 ; i<= n/2 ; i++)
            if(n%i == 0){
                for(int j =0 ; j<n ; j++){
                count[j] = i ;
                }
            }   
        }

        return Array.toString(count);
    }

    public static int sum(int[] factorArray){
        for(int i = 0 ;i<=factorArray.length ; i++){
            int sum =0 ;
            sum = sum + factorArray[i];
        }
        return sum;
    }

     public static int Product(int[] factorArray){
        for(int i = 0 ;i<=factorArray.length ; i++){
            int product =1;
            product = product * factorArray[i];
        }
        return product;
    }

    public static int SquareSum(int[] factorArray){
        for(int i = 0 ;i<=factorArray.length ; i++){
            int SquareValues = Math.pow(factorArray[i] , 2);
            int sum =0;
            sum = sum + SquareValues;
            
        }
        return sum;
    }



} 