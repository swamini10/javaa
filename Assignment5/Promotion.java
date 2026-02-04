//Check eligibility for promotion.

import java.util.Scanner;

public class Promotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();

        System.out.print("Enter performance rating (1 to 5): ");
        int rating = sc.nextInt();

        if (experience >= 3 && rating >= 3) {
            System.out.println("Eligible for Promotion");
        } else {
            System.out.println("Not Eligible for Promotion");
        }

    }
}