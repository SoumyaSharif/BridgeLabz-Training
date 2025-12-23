import java.util.Scanner;
import java.util.Arrays;

public class SplitTextWithoutSplit {

    //Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string reached
        }
        return count;
    }

    //Method to split text into words without using split()
    public static String[] customSplit(String text) {

        int length = findLength(text);

        //Count number of words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        //Store indexes of spaces
        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }

        //Extract words using indexes
        String[] words = new String[wordCount];

        int start = 0;
        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        // last word
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    //Method to compare two String arrays
    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Take input using nextLine()
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        //Built-in split()
        String[] builtInSplit = input.split(" ");

        //User-defined split
        String[] customSplitResult = customSplit(input);

        //Display both results
        System.out.println("Built-in split(): " + Arrays.toString(builtInSplit));
        System.out.println("Custom split():   " + Arrays.toString(customSplitResult));

        //Compare results
        boolean result = compareArrays(builtInSplit, customSplitResult);
        System.out.println("Are both results equal? " + result);
    }
}
