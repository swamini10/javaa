//Check whether number is divisible by 2, 3, or 5.

import java.util.Scanner;

public class DivisibleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
            System.out.println("The number is divisible by 2, 3, or 5.");
        } else {
            System.out.println("The number is not divisible by 2, 3, or 5.");
        }
    }
}
