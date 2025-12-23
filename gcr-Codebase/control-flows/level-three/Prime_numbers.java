import java.util.Scanner;

public class Prime_numbers{
    public static void main(String[] args){
        
        //using Scanner to input values given by the user 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        
        if(number <= 1){
            isPrime = false;
        }
        else{
            for(int i =2 ; i<= number/2 ; i++){
                if(number%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("A Prime number " + isPrime);
        }
        else{
            System.out.println("its not a Prime number " + isPrime);
        }


        
    }
}