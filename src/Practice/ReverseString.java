package Practice;

import java.sql.SQLOutput;

public class ReverseString {

    public static void main(String[] args){

        String str = "Hackerrank" ;
        StringBuilder str2 = new StringBuilder();

        for(int i=str.length()-1 ; i>=0 ; i--){
            //adding each character to a new string
            str2.append(str.charAt(i));
        }

        System.out.println(str2) ;

    }
}
