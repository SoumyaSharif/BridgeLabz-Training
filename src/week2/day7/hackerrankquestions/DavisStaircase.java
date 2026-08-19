package week2.day7.hackerrankquestions;
import java.util.Arrays;

public class DavisStaircase {
    //why memoisation?

    static long[] memo;

    public static int stepPerms(int n) {
        memo = new long[n + 1];
        Arrays.fill(memo, -1);
        return (int) solve(n);
    }

    static long solve(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (memo[n] != -1) return memo[n];

        return memo[n] = solve(n - 1) + solve(n - 2) + solve(n - 3);
    }
}
