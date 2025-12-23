import java.util.*;
public class UpperCaseLowerCase{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        
        CheckLowerCase(s);

        CheckUpperCase(s);
    }

    public static String CheckLowerCase(String s){
        String ans = " " ;
        Boolean islower = true ;
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                System.out.println("lowercase");
                islower = true ;
                ans= ans + ch + "  " ;
            }
            System.out.println("ans " + islower);
        }
        return " " ;
    }

    public static String CheckUpperCase(String s){
        String ans = " " ;
        Boolean isUpper = true ;
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.println("Uppercase");
                isUpper = true ;
                ans= ans + ch + "  " ;
            }
            System.out.println("ans " +  isUpper);
        }
        return " " ;

    }

}