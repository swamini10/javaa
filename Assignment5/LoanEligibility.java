//Check eligibility for loan.

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int Score = sc.nextInt();

        if (age >= 21 && income >= 25000 && Score >= 700) {
            System.out.println("Eligible for Loan");
        } else {
            System.out.println("Not Eligible for Loan");
        }

    }
}