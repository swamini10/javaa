//Calculate movie ticket price with discount.

import java.util.Scanner;

public class MovieTicket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = ticketPrice * discountPercent / 100;
        double finalPrice = ticketPrice - discountAmount;

        System.out.println("Discount Amount = Rs." + discountAmount);
        System.out.println("Final Ticket Price = Rs." + finalPrice);
    }
}


