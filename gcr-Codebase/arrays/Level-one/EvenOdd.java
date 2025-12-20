import java.util.*;

public class EvenOdd{
    public static void main(String[] args){
        
        //Create an array to store maximum n values
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] Even = new int[(number/2)+1];
        int[] Odd = new int[(number/2)+1];


        if(number<0){
            System.out.println("Invalid");
            return;
        }
        
            int EvenIndex =0;
            int OddIndex=0;

            for(int i=1 ; i<number ; i++){
                if(i%2==0){
                    Even[EvenIndex++] = i ;
                }
                else{
                    Odd[OddIndex++] = i ;
                }
            }
         System.out.println(Arrays.toString(Arrays.copyOf(Even, EvenIndex)));
         System.out.println(Arrays.toString(Arrays.copyOf(Odd, OddIndex)));
    }   
}
