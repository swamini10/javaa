//Calculate electricity bill based on unit.

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        int units;
        double bill;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        units = sc.nextInt();

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + (units - 100) * 2.5;
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + (units - 200) * 3.5;
        }

        System.out.println("Electricity Bill = Rs." + bill);
    }
}


