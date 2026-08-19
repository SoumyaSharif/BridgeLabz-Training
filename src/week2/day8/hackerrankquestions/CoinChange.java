package week2.day8.hackerrankquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinChange {
    class Result {

        public static long getWays(int n, List<Long> c) {

            long[] dp = new long[n + 1];

            // One way to make amount 0
            dp[0] = 1;

            // Pick each coin
            for(long coin : c) {

                // Calculate ways for every amount
                // that can use this coin
                for(int amount = (int) coin; amount <= n; amount++) {

                    dp[amount] += dp[amount - (int) coin];
                }
            }

            return dp[n];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input: n and number of coins
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Store coins
        List<Long> c = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            c.add(sc.nextLong());
        }

        // Call function
        long ways = Result.getWays(n, c);

        // Print answer
        System.out.println(ways);

        sc.close();
    }
}
