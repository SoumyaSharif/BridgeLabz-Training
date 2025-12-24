import java.util.*;

public class ReverseString{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println("The String reversed is " + Reverse(s));

    }

    public static String Reverse(String s){
        StringBuilder result = new StringBuilder() ;

        for(int i=s.length() -1 ; i>=0 ; i--){
           result.append(s.charAt(i));
        }

        return result.toString();

    }

}