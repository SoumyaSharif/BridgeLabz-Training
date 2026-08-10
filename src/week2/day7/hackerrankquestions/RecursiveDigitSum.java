package week2.day7.hackerrankquestions;

public class RecursiveDigitSum {

    public static int superDigit(String n, int k) {
        // Write your code here
        long sum = 0;

        for(char c : n.toCharArray()){
            sum += c - '0';
        }
        sum *= k;

        if(sum < 10){
            return (int) sum;
        }

        return superDigit(String.valueOf(sum), 1);

    }
}
}
