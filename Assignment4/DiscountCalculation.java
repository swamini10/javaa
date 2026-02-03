//Calculate discount based on purchase amount.

import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        double amount, discount, finalAmount;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        amount = sc.nextDouble();

        if (amount < 1000) {
            discount = 0;
        }
        else if (amount <= 5000) {
            discount = amount * 0.10;
        }
        else if (amount <= 10000) {
            discount = amount * 0.20;
        }
        else {
            discount = amount * 0.30;
        }

        finalAmount = amount - discount;

        System.out.println("Discount = Rs. " + discount);
        System.out.println("Final Amount to Pay = Rs. " + finalAmount);
    }
}