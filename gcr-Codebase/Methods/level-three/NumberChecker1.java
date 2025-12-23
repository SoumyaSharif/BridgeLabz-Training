import java.util.*;

public class NumberChecker1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Count of digits are " + countDigits(number));
        System.out.println("Digits in digit array are " + Arrays.toString(getDigits(number)));
        System.out.println("Is Duck Number? " + isDuck(number));
        System.out.println("Is Armstrong Number? " + isArmstrong(number));
        System.out.println("Largest and second largest digits are " + largest(getDigits(number)));
        System.out.println("Smallest and second smallest digits are " + smallest(getDigits(number)));
    }

    public static int countDigits(int n) {
        int c = 0;
        while (n > 0){
            c++;
            n /= 10;
        }
        return c;
    }

    public static int[] getDigits(int n) {
        int c = countDigits(n);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    public static boolean isDuck(int n) {
        while (n > 0) {
            if (n % 10 == 0)
                return true;
            n /= 10;
        }
        return false;
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        return sum == original;
    }

    public static String largest(int[] d) {
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;

        for (int x : d) {
            if (x > max) {
                smax = max;
                max = x;
            } else if (x > smax && x != max) {
                smax = x;
            }
        }
        return max + " " + smax;
    }

    public static String smallest(int[] d) {
        int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;

        for (int x : d) {
            if (x < min) {
                smin = min;
                min = x;
            } else if (x < smin && x != min) {
                smin = x;
            }
        }
        return min + " " + smin;
    }
}
