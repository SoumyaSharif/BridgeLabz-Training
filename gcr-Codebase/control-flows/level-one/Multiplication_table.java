import java.util.Scanner;

public class Multiplication_table{
    public static void main(String[] args){
   
    //Input given by the user
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    //checking if the n is in range and print output multiplication table
    if(n>5 && n<10){
       for(int i =1 ; i <=10 ; i++){
        System.out.println(n + "*" + i + "=" + n*i);
       }    
    }
    else{
        System.out.print("not in the range between 6-9");
    }
    }
}