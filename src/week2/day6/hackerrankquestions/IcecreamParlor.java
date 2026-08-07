package week2.day6.hackerrankquestions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class IcecreamParlor {
    public static void main(String[] args) throws IOException {

            int m = 4;

            List<Integer> arr = Arrays.asList(2, 2, 4, 3);

            List<Integer> result = Result.icecreamParlor(m, arr);

            System.out.println(result);
    }

    class Result {

        /*
         * Complete the 'icecreamParlor' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER m
         *  2. INTEGER_ARRAY arr
         */

        public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

            int n = arr.size();

            // pair[i][0] = value
            // pair[i][1] = original index (1-based)
            int[][] pair = new int[n][2];

            for (int i = 0; i < n; i++) {
                pair[i][0] = arr.get(i);
                pair[i][1] = i + 1;
            }

            // Sort according to value
            Arrays.sort(pair, Comparator.comparingInt(a -> a[0]));

            for (int i = 0; i < n; i++) {

                int target = m - pair[i][0];

                int pos = binarySearch(pair, i + 1, n - 1, target);

                if (pos != -1) {

                    int index1 = pair[i][1];
                    int index2 = pair[pos][1];

                    if (index1 < index2)
                        return Arrays.asList(index1, index2);
                    else
                        return Arrays.asList(index2, index1);
                }
            }

            return new ArrayList<>();
        }

        public static int binarySearch(int[][] pair, int left, int right, int target) {

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (pair[mid][0] == target)
                    return mid;

                else if (pair[mid][0] < target)
                    left = mid + 1;

                else
                    right = mid - 1;
            }

            return -1;
        }
    }



    //new array create krke store index --> sort the original array --> binary search
    /*
    * Input:
Prices[]
Budget

Create an array of objects
Each object stores:
    Price
    Original Index

Store all prices with their original indices.

Sort the array based on Price.

For each element

    Remaining = Budget - Current Price

    Search Remaining using Binary Search

    If found

        Print both Original Indices

        Stop

Print "No Pair Found"
    * */
}
