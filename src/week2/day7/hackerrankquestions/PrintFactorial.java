package week2.day7.hackerrankquestions;

public class PrintFactorial {

    public static int factorial(int n) {
        // Write your code here
        if(n <= 1){
            return 1;
        }

        int nfactor = n * factorial(n-1);

        return nfactor;

    }

}
