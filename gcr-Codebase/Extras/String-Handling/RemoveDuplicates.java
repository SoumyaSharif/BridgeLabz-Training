import java.util.*;

public class RemoveDuplicates{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(RemoveDuplicates(s));

    }

    public static String RemoveDuplicates(String s){
        String result = " " ;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch ; 
            }   

        }    
        return result;   
    }  
   
}
