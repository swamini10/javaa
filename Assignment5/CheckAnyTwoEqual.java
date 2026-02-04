//Check whether any two numbers are equal.

import java.util.Scanner;

public class CheckAnyTwoEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a == b || b == c || a == c) {
            System.out.println("At least two numbers are equal.");
        } else {
            System.out.println("No two numbers are equal.");
        }

        sc.close();
    }
}
