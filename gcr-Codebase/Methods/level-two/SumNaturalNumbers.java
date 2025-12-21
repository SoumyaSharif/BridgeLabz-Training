import java.util.Scanner;

public class SumNaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number (n > 0)");
            return;
        }

        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);

        System.out.println("Sum using Recursion: " + recursiveSum);
        System.out.println("Sum using Formula n*(n+1)/2: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Result is correct. Both methods give the same sum.");
        } else {
            System.out.println("Result is incorrect. The sums do not match.");
        }
    }

    // Recursive method
    public static int sumRecursive(int n) {
        if (n == 1)
            return 1;
        return n + sumRecursive(n - 1);
    }

    // Formula method
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
}
