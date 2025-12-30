import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0;
        char choice;

        do {
            System.out.print("Enter Mobile Operator (Jio/Airtel/VI): ");
            String operator = sc.next();

            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();

            // Switch for offers
            switch (operator.toLowerCase()) {
                case "jio":
                    System.out.println("Offer: 2GB/day for 28 days");
                    break;
                case "airtel":
                    System.out.println("Offer: 1.5GB/day + Unlimited Calls");
                    break;
                case "vi":
                    System.out.println("Offer: Weekend Data Rollover");
                    break;
                default:
                    System.out.println("Invalid operator");
                    continue;
            }

            balance += amount;
            System.out.println("Current Balance: ₹" + balance);

            System.out.print("Do you want to recharge again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }
}
