//Calculate exam fee.

import java.util.Scanner;

public class ExamFee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base exam fee: ");
        double baseFee = sc.nextDouble();

        System.out.print("Enter additional charges: ");
        double extraCharges = sc.nextDouble();

        double totalFee = baseFee + extraCharges;

        System.out.println("Total Exam Fee = Rs." + totalFee);
    }
}
