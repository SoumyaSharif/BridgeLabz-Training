import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char moreCustomers;

        do {
            double ticketPrice = 0;
            double snackPrice = 0;

            // Movie type selection
            System.out.print("Enter Movie Type (2D/3D): ");
            String movieType = sc.next();

            switch (movieType.toUpperCase()) {
                case "2D":
                    ticketPrice = 150;
                    break;
                case "3D":
                    ticketPrice = 250;
                    break;
                default:
                    System.out.println("Invalid movie type!");
                    continue;
            }

            // Seat type selection
            System.out.print("Enter Seat Type (Gold/Silver): ");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("Gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            // Snacks option
            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            if (snacks.equalsIgnoreCase("yes")) {
                snackPrice = 80;
            }

            double totalAmount = ticketPrice + snackPrice;

            System.out.println("Total Ticket Cost: ₹" + totalAmount);

            System.out.print("Next customer? (y/n): ");
            moreCustomers = sc.next().charAt(0);

        } while (moreCustomers == 'y' || moreCustomers == 'Y');
    }
}
