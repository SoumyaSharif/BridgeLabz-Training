import java.util.Scanner;

public class ShopkeeperDiscountDashboard {

    // Constants for discount rates
    public static final double DISCOUNT_10 = 0.10;
    public static final double DISCOUNT_20 = 0.20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double totalBill = 0;

        // Input item prices using for loop
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            totalBill += price;
        }

        double discount = 0;

        // Discount logic using if-else
        if (totalBill >= 500 && totalBill < 1000) {
            discount = totalBill * DISCOUNT_10;
        } else if (totalBill >= 1000) {
            discount = totalBill * DISCOUNT_20;
        }

        double finalAmount = totalBill - discount;

        System.out.println("\nTotal Bill: ₹" + totalBill);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount to Pay: ₹" + finalAmount);
    }
}
