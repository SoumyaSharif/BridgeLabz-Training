import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 200;

        while (balance > 0) {
            System.out.println("Current Balance: ₹" + balance);
            System.out.print("Enter distance (km) or -1 to quit: ");
            int distance = sc.nextInt();

            if (distance == -1) {
                break;
            }

            int fare = (distance <= 5) ? 10 :
                       (distance <= 15) ? 20 : 30;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare ₹" + fare + " deducted.");
            } else {
                System.out.println("Insufficient balance!");
                break;
            }
        }

        System.out.println("Thank you for using Metro.");
        sc.close();
    }
}
