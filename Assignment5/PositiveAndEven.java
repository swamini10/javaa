//Check whether input is positive and even.

import java.util.Scanner;

public class PositiveAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0 && n % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else {
            System.out.println("The number is not positive and even.");
        }
    }
}
