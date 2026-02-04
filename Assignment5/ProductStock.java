//Check whether product is in stock.

import java.util.Scanner;

public class ProductStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();

        if (quantity > 10) {
            System.out.println("Product is In Stock");
        } else {
            System.out.println("Product is Out of Stock");
        }

    }
}