package java8conceptpractice.com.lambdaexpression.ecommerce;
import java.lang.reflect.Array;
import java.util.*;


import java.util.*;

public class EcommerceDemo {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
            new Product("Phone", 30000, 4.5, 10),
            new Product("Laptop", 70000, 4.7, 15),
            new Product("Headphones", 2000, 4.2, 20)
        );

        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        // Sort by rating
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        // Sort by discount
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}
