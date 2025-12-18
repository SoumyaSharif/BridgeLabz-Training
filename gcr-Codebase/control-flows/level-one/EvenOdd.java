import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){
   
    //Input given by the user
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    //for loop for finding even or odd
    for(int i=1 ; i<=n ; i++){
    
        if(i%2 == 0){
            System.out.println(i + " is Even");
            
        }
        else{
            System.out.println(i + " is odd"); 
        } 
    }
    
    }
}