import java.util.*;
import java.util.Scanner;

public class Power{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); //2
    int b = sc.nextInt();  //4

    double result = Math.pow(a,b) ;
    System.out.println(result);
    }
}

