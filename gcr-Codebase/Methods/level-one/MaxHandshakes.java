import java.util.*;

public class MaxHandshakes{

    public static int Maximum(int n){
        int max = (n*(n-1))/2 ;
        return max;
    }
    
    public static void main(String[] args){
           
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
       
        Maximum(numberOfStudents);

        System.out.println("The number of handshakes are  " + Maximum(numberOfStudents));
        
    }
    
}
    

