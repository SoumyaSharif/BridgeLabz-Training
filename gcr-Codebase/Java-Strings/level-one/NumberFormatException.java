import java.util.*;

public class DemonstrationFour{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();

         generateException(str);

         HandledException(str);

    }
    
    //Method generating the exception
    public static void generateException(String str){
        System.out.println(Integer.parseInt(str));
    
    }

    //Method handles the exceptions
    public static void HandledException(String str){

        try{
            System.out.println(Integer.parseInt(str));
        }
        catch(NumberFormatException error) {
            System.out.println("NumberFormatException Handled");
        }
        catch(RuntimeException error){
            System.out.println("RuntimeException Handled");
        }
    }


}