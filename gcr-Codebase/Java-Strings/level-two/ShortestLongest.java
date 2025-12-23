import java.util.*;

public class ShortestLongest{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = customSplit(input);

        // Create 2D array
        String[][] wordTable = CreateWordLengthTable(words);

        // Find shortest and longest
        int[] result = findShortestAndLongest(wordTable);

        int shortestIndex = result[0];
        int longestIndex = result[1];

        // Display result
        System.out.println("\nShortest word: " 
                + wordTable[shortestIndex][0] 
                + " (Length: " 
                + Integer.parseInt(wordTable[shortestIndex][1]) + ")");

        System.out.println("Longest word: " 
                + wordTable[longestIndex][0] 
                + " (Length: " 
                + Integer.parseInt(wordTable[longestIndex][1]) + ")");

    }
    
    public static String[][] CreateWordLenth(String[] words){
        String[][] table = new String[words.length][2];

        for(int i=0 ; i<words.length ; i++){
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table ;

    }

    public static int[] findShortestAndLongest(String[][] table){
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < table.length; i++) {
            int currentLength = Integer.parseInt(table[i][1]);
            int minLength = Integer.parseInt(table[minIndex][1]);
            int maxLength = Integer.parseInt(table[maxIndex][1]);

            if (currentLength < minLength) {
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxIndex = i;
            }
         return new int[]{minIndex, maxIndex};

        }
    } 

    //Method to find length without using length()
    public static int findLength(String str) {
    int count = 0;
    try {
        while (true) {
            str.charAt(count); // access character
            count++;           // increase count
        }
    } catch (StringIndexOutOfBoundsException e) {
        // exception occurs when index exceeds string length
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
}