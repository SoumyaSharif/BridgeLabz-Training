import java.util.*;

public class TwoStrings{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine() ; 
        String str2 = sc.nextLine() ; 
        Boolean isSame= true;

        System.out.print("to check if two string are equals " + Method1( str1,  str2) + " and " + Method2( str1,  str2));
    }

    public static boolean Method1(String str1, String str2){
        //Method 1 
        Boolean isSame= true;
        if(str1.length() != str2.length() ){
            isSame = false;
        }
        else{
            for(int i=0 ; i<str1.length() ; i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    isSame = false;
                    break;
                }
            }
        }
        return isSame;
    }

    public static boolean Method2(String str1, String str2){
        //Method 2 
        Boolean isSame= true;
        if(str1.equals(str2)){
            isSame = true ;
        }
        else{
            isSame = false;
        }
        return isSame;
    }

    
}