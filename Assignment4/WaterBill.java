//Calculate water bill based on consumption.

import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        int liters;
        double bill;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter water consumption (in liters): ");
        liters = sc.nextInt();

        if (liters <= 1000) {
            bill = (liters / 100.0) * 5;
        }
        else if (liters <= 2000) {
            bill = (1000 / 100.0) * 5  + ((liters - 1000) / 100.0) * 7;
        }
        else {
            bill = (1000 / 100.0) * 5 + (1000 / 100.0) * 7 + ((liters - 2000) / 100.0) * 10;
        }

        System.out.println("Water Bill = Rs. " + bill);
    }
}
