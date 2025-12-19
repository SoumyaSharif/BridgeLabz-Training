import java.util.Scanner;

public class FizzBizz_while{
    public static void main(String[] args){
        
        //using Scanner to input values given by the user 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n =1 ;

        //Checking for Natural number and printing the output Fizz, Bizz , FizzBizz
        if(number>0){
            System.out.println("positive");
            while(n<=number){
                if(n%5 == 0 && n%3 == 0){
                    System.out.println("FizzBizz");
                }
                else if(n%3 == 0){
                    System.out.println("Fizz");
                }
                else if(n%5 == 0){
                    System.out.println("Bizz");
                }
                else if(n%3 !=0 && n%5 !=0){
                    System.out.println(n);
                }
                n++ ;
            }
        }
    }
}