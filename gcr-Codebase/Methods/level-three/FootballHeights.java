import java.util.*;
public class FootballHeights {

    public static int sum(int[] a) {
        int s = 0;
        for (int x : a) {
            s = s + x;
        }
        return s;
    }

    public static int min(int[] a) {
        int m = a[0];
        for (int x : a) {
            if (x < m) {
                m = x;
            }
        }
        return m;
    }

    public static int max(int[] a) {
        int m = a[0];
        for (int x : a) {
            if (x > m) {
                m = x;
            }
        }
        return m;
    }

    public static double mean(int[] a) {
        return (double) sum(a) / a.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[3];

        for (int i = 0; i < heights.length; i++){
            heights[i] = sc.nextInt();
        }
 
        System.out.println("minimus height : " + min(heights));
        System.out.println("maximum height : " + max(heights));
        System.out.println("mean of height : " + mean(heights));
    }
}
