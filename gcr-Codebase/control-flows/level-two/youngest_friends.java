import java.util.Scanner;

public class youngest_friends{
    public static void main(String[] args){
        
        //using Scanner to input values given by the user 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar age : ");
        int Amar_age = sc.nextInt();
        System.out.print("Enter Amar height : ");
        double Amar_height = sc.nextDouble();
        System.out.print("Enter Akbar age : ");
        int Akbar_age = sc.nextInt();
        System.out.print("Enter Akbar height : ");
        double Akbar_height = sc.nextDouble();
        System.out.print("Enter Anthony age : ");
        int Anthony_age = sc.nextInt();
        System.out.print("Enter Anthony height : ");
        double Anthony_height = sc.nextDouble();

        //Checking for and print the output of friend who is youngest and tallest.
        if(Amar_age<Akbar_age && Amar_age<Anthony_age){
            System.out.print(" Amar is the youngest ");
        }
        else if(Akbar_age<Amar_age && Akbar_age<Anthony_age){
            System.out.print(" Akbar is the youngest ");
        }
        else if(Anthony_age<Akbar_age && Anthony_age<Amar_age){
            System.out.print("Anthony is the youngest ");
        }
        if(Amar_height>Akbar_height && Amar_height>Anthony_height){
            System.out.print("Amar is the largest ");
        }
        else if(Akbar_height>Amar_height && Akbar_height>Anthony_height){
            System.out.print("Akbar is the largest ");
        }
        else if(Anthony_height>Akbar_height && Anthony_height>Amar_height){
            System.out.print("Anthony is the largest ");
        }
    }
}