/*20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/
import java.util.* ;
public class LuckyDraw {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");

        for(int i=0 ; i <= 3 ; i++){
        int input = sc.nextInt();

        if(input%3 == 0 || input%5 == 0){
            System.out.println("You Won! ");
            break;
        }else{
            System.out.println("You didnt Win , Try next Time! ");
            continue;
        }
        
    }
    sc.close();
    }
}
