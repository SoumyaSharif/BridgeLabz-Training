import java.util.*;

public class ExceptionDemonstration1{
   public static void main(String[] args){

      HandleException();

   }
 
   //Method to generate exception
   public static void generateException(){
       String text = null ; 
       System.out.println(text.length());
   }
 
   //Method demonstrating NullPointerException
   public static void HandleException(){
       
       try {
           generateException();
       }
       catch(NullPointerException error ){
           System.out.println("NullPointerException handled");
       }
   }


}