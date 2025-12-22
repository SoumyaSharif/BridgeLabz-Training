import java.util.*;

public class SubString{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String name " );
        String str1 = sc.nextLine(); 
        System.out.println("Enter start index " );
        int start = sc.nextInt();
        System.out.println("Enter end index " );
        int end = sc.nextInt();

        System.out.println("Comparing 1 methods " +Method1(str1,start,end)+ " and " + Method2(str1 , start , end ) );

    }

    public static String Method1(String str1 ,int start , int end ){
        String answer = " " ;
        for(int i=start ; i<end ; i++){
            char ch = str1.charAt(i);
            answer = answer + ch ;
        }

        return answer;
    }
     
    public static String Method2(String str1 ,int start ,int end){
        String answer = str1.substring(start,end); 
        return answer;      
    }
        
    }

