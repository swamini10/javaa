//Calculate bus ticket fare.

import java.util.Scanner;

public class BusFare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter fare per km: ");
        double ratePerKm = sc.nextDouble();

        double fare = distance * ratePerKm;

        System.out.println("Total Bus Ticket Fare = Rs." + fare);
    }
}