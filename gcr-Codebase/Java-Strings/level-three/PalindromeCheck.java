import java.util.Scanner;

public class PalindromeCheck {

    //Iterative comparison using start & end index
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //Recursive palindrome check
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        //Base condition
        if (start >= end) {
            return true;
        }

        //Character comparison
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        //Recursive call
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    //Method to reverse string using charAt()
    public static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }

    //Logic 3: Using character arrays
    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Remove spaces and convert to lowercase (optional but recommended)
        text = text.replaceAll("\\s+", "").toLowerCase();

        System.out.println("\nLogic 1 (Iterative): "
                + (isPalindromeLogic1(text) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 2 (Recursive): "
                + (isPalindromeLogic2(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 3 (Char Array): "
                + (isPalindromeLogic3(text) ? "Palindrome" : "Not Palindrome"));
    }
}
