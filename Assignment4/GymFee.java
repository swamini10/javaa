//Calculate gym membership charges.

import java.util.Scanner;

public class GymFee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly gym fee: ");
        double monthlyFee = sc.nextDouble();

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        System.out.print("Enter extra charges: ");
        double extraCharges = sc.nextDouble();

        double totalFee = (monthlyFee * months) + extraCharges;

        System.out.println("Total Gym Membership Charges = Rs." + totalFee);
    }
}
