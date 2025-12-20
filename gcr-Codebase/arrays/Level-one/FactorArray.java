import java.util.Scanner;

public class FactorArray{
    public static void main(String[] args){
        
        //Create an array to store factors of number , number variable for input 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int MaxFactor = 10;
        int FactorIndex = 0;
        int[] Factors = new int[MaxFactor];       

        //Create a loop for checking for factors 
        for(int i=1 ; i<=number ; i++){
            if(number%i == 0){

                //Check if there are more than MaxFactor factors , enlarge array
                if(FactorIndex == MaxFactor){
                    MaxFactor = MaxFactor * 2;
                    int[] NewFactor = new int[MaxFactor];
                    for(int j=0 ; j<Factors.length ; j++){
                        NewFactor[j] = Factors[j];
                    }
                    Factors = NewFactor ;
            }    
                //Adding values to the Factor array
                Factors[FactorIndex++] = i ;
            }
        }
        //Display the result
        for (int i = 0; i < FactorIndex; i++) {
            System.out.print(Factors[i] + " ");           
    }
  }
}