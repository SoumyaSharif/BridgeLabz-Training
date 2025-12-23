import java.util.*;

public class ExceptionDemonstrationTwo { 
    public static void main(String[] args){
        HandleException();
    }

    //StringoutofboundException is called
    public static void GenerateException(){
        String str = "hello";
        System.out.println(str.charAt(11));

    }

    //Creating a method to handle this exception
    public static void HandleException(){
        
        try{
            GenerateException();
        }
        catch(StringIndexOutOfBoundsException
 error){
            System.out.println("There exists no such character");    
        }
    }


}