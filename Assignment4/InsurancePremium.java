//Calculate insurance premium.

import java.util.Scanner;

public class InsurancePremium{
    public static void main(String[] args) {
        int age;
        double sumAssured, premium;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter sum assured: ");
        sumAssured = sc.nextDouble();

        if (age < 25) {
            premium = sumAssured * 0.03;
        }
        else if (age <= 40) {
            premium = sumAssured * 0.04;
        }
        else {
            premium = sumAssured * 0.05;
        }

        System.out.println("Insurance Premium = Rs. " + premium);
    }
}
