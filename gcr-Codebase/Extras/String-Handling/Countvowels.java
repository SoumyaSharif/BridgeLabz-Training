import java.util.*;

public class Countvowels{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println("The number of vowels and consonants are " + CheckVowels(s) + " and " + CheckConsonants(s));

    }

    public static int CheckVowels(String s){
        int count  =0;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if( ch == 'i' || ch == 'e' || ch == 'o' || ch == 'a' || ch == 'u'){
                count ++ ;
            }
        }
        return count;
    }


    public static int CheckConsonants(String s){
        int count  =s.length();
        for(int i=0 ; i<s.length() ; i++){
            
            char ch = s.charAt(i);
            if( ch == 'i' || ch == 'e' || ch == 'o' || ch == 'a' || ch == 'u'){
                count-- ;
            }
        }
        return count;
    }

}