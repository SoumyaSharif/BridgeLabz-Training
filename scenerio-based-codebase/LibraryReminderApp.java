import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int FINE_PER_DAY = 5;
        final int TOTAL_BOOKS = 5;

        // Loop for 5 books
        for (int i = 1; i <= TOTAL_BOOKS; i++) {
            System.out.println("\nBook " + i);

            System.out.print("Enter Due Date (day): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date (day): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * FINE_PER_DAY;

                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }
    }
}
