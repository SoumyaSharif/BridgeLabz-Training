import java.util.Scanner;

public class FizzBizz{
    public static void main(String[] args){
        
        //using Scanner to input values given by the user 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //Checking for Natural number and printing the output Fizz, Bizz , FizzBizz
        if(number>0){
            System.out.println("positive");
            for(int i=1 ; i <= number ; i++){
                if(i%5 == 0 && i%3 == 0){
                    System.out.println("FizzBizz");
                }
                else if(i%3 == 0){
                    System.out.println("Fizz");
                }
                else if(i%5 == 0){
                    System.out.println("Bizz");
                }
                else if(i%3 !=0 && i%5 !=0){
                    System.out.println(i);
                }
            }
        }
    }
}