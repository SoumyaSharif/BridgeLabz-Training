import java.util.Scanner;

public class TrainReservationQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int availableSeats = 5;
        int choice;

        while (true) {
            System.out.println("\n--- Train Reservation Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (availableSeats > 0) {
                        availableSeats--;
                        System.out.println("Ticket booked successfully!");
                        System.out.println("Remaining Seats: " + availableSeats);
                    } else {
                        System.out.println("No seats available!");
                        break; // stop booking
                    }
                    break;

                case 2:
                    System.out.println("Available Seats: " + availableSeats);
                    break;

                case 3:
                    System.out.println("Thank you for using the system.");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }

            // Stop booking once seats are zero
            if (availableSeats == 0) {
                System.out.println("All seats are booked. Booking closed.");
                break;
            }
        }
    }
}
