import java.util.*;
public class FizzBizz{
    public static void main(String[] args){
        
        //Input given by the user 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
    
        if(N>0){
            String[] result = new String[N+1];
            for(int i=0 ; i<= N ; i++){
                if (i % 3 == 0 && i % 5 == 0) {
                    result[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    result[i] = "Fizz";
                } else if (i % 5 == 0) {
                    result[i] = "Buzz";
                } else {
                    result[i] = String.valueOf(i);
                }
            }

            for(int i=0 ; i<= N ; i++){
                System.out.println("Position" + i + "=" + result[i]);
            }
        }
        else{
            System.out.println("Please enter a positive number");
        }
    }
}
    