//Check eligibility for admission.

import java.util.Scanner;

public class Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();

        if (age >= 17 && percentage >= 60) {
            System.out.println("Eligible for Admission");
        } else {
            System.out.println("Not Eligible for Admission");
        }

    }
}