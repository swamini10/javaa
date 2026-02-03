//Calculate mobile recharge plan amount.

import java.util.Scanner;

public class MobileRecharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base plan amount: ");
        double baseAmount = sc.nextDouble();

        double gst = baseAmount * 0.18; 
        double extraCharges = 10;       

        double totalAmount = baseAmount + gst + extraCharges;

        System.out.println("GST = Rs." + gst);
        System.out.println("Total Recharge Amount = Rs." + totalAmount);
    }
}