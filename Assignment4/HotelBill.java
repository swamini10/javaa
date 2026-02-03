//Calculate hotel room charges.

import java.util.Scanner;

public class HotelBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rent per day: ");
        double rentPerDay = sc.nextDouble();

        System.out.print("Enter number of days stayed: ");
        int days = sc.nextInt();

        System.out.print("Enter additional charges: ");
        double extraCharges = sc.nextDouble();

        double roomCharge = rentPerDay * days;
        double totalBill = roomCharge + extraCharges;

        System.out.println("Total Hotel Room Charges = Rs." + totalBill);
    }
}