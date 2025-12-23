import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // i. Create frequency array for ASCII characters
        int[] freq = new int[256];

        // ii. Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // iii. Find first non-repeating character
        boolean found = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                System.out.println("First non-repeating character: " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found");
        }
    }
}
