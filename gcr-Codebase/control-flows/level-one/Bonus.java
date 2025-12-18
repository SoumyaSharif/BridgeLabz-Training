import java.util.Scanner;

public class Bonus{
    public static void main(String[] args){
   
    //Input given by the user
    Scanner sc = new Scanner(System.in);
    int salary = sc.nextInt();
    int yearsOfService = sc.nextInt();
    int bonusAmount = (salary * 5)/100 ;

    //if the years of service is more than 5 , print output salary with bonus
    if(yearsOfService > 5){
        salary = salary + bonusAmount ;
        System.out.print(salary);
    }
    else{
        System.out.print("not enough years");
    }


    }
}