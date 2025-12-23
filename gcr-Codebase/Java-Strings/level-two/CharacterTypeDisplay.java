import java.util.Scanner;

public class CharacterTypeDisplay {

    //Method to check character type
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    //Method to create 2D array
    public static String[][] getCharacterDetails(String text) {
        String[][] details = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            details[i][0] = String.valueOf(text.charAt(i));
            details[i][1] = checkCharacter(text.charAt(i));
        }
        return details;
    }

    //Method to display 2D array
    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        System.out.println("---------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = getCharacterDetails(text);
        displayTable(result);
    }
}
