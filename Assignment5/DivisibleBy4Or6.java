//Check whether number is divisible by 4 or 6.

import java.util.Scanner;

public class DivisibleBy4Or6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 4 == 0 || n % 6 == 0) {
            System.out.println("The number is divisible by 4 or 6.");
        } else {
            System.out.println("The number is not divisible by 4 or 6.");
        }
    }
}
