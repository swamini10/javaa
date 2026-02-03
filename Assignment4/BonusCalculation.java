//Calculate bonus based on salary.

import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        double salary, bonus;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        if (salary <= 10000) {
            bonus = salary * 0.05;
        }
        else if (salary <= 20000) {
            bonus = salary * 0.10;
        }
        else {
            bonus = salary * 0.15;
        }

        System.out.println("Bonus = Rs. " + bonus);
    }
}