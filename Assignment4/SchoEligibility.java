//Check eligibility for scholarship

import java.util.Scanner;

public class SchoEligibility{
    public static void main(String[] args) {
        double percentage;
        double income;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        percentage = sc.nextDouble();

        System.out.print("Enter family income: ");
        income = sc.nextDouble();

        if (percentage >= 75 && income <= 200000) {
            System.out.println("Student is Eligible for Scholarship");
        } else {
            System.out.println("Student is Not Eligible for Scholarship");
        }
    }
}
