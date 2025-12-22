import java.util.*;

public class ReturnAllCharacters{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println("The characters of str1 are " + PrintCharacters(str) + " And Compare str and str2 " + CompareStrings(str, str2));
    }

    public static String PrintCharacters(String str){
        String answer = " " ;
        for(int i =0 ; i<str.length() ; i++){
           
            char ch = str.charAt(i);
            answer = answer + ch + " " ;
        }    
        return answer;
    }

    public static boolean CompareStrings(String str , String str2){
       return str.equals(str2);
    }
}

