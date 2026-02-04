//Check whether three numbers are equal.

import java.util.Scanner;

public class CheckThreeEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("All three numbers are equal.");
        } else {
            System.out.println("The three numbers are not equal.");
        }

        sc.close();
    }
}
