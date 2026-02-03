//Calculate commission based on sales.

import java.util.Scanner;

public class CommissionCal{
    public static void main(String[] args) {
        double sales, commission;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales amount: ");
        sales = sc.nextDouble();

        if (sales < 10000) {
            commission = sales * 0.05;
        }
        else if (sales <= 50000) {
            commission = sales * 0.10;
        }
        else {
            commission = sales * 0.15;
        }

        System.out.println("Commission = Rs. " + commission);
    }
}