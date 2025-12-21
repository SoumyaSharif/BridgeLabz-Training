import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {

        // Condition for Gregorian calendar
        if (year < 1582) {
            System.out.println("Leap Year check is valid only for year >= 1582");
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;

        return false;
    }
}
