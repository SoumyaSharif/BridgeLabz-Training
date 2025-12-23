import java.util.*;

public class ExceptionDemonstrationThree{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

       // generateException(str);

        HandleException(str);
    }

    //Method to create a exception 
    public static void generateException(String str){
        System.out.println(str.substring(5,2));
    }

    //Method contains try and catch block to catch exception
    public static void HandleException(String str){
        try{
            int start =5 ;
            int end =2 ; 
             
            if(start>end){
                throw new IllegalArgumentException("Start index greater than end index");
            }
            System.out.println(str.substring(start,end));
        }
        catch(IllegalArgumentException error){
            System.out.println("IllegalArgumentException caught");
        }
        catch(RuntimeException error){
            System.out.println("RuntimeException caught");
        }
    }


}

