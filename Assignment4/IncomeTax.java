//Calculate tax based on income.

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        double income, tax = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income: ");
        income = sc.nextDouble();

        if (income <= 250000) {
            tax = 0;
        }
        else if (income <= 500000) {
            tax= income * 0.05;
        }
		else if (income <= 1000000) {
			tax = (250000 * 0.05) + (income - 500000) * 0.20;
        }
        else {
            tax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;
        }

        System.out.println("Income Tax = Rs. " + tax);
    }
}