//Check whether input is negative and odd

import java.util.Scanner;
public class NegativeAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 0 && n % 2 != 0) {
            System.out.println("The number is negative and odd.");
        } else {
            System.out.println("The number is not negative and odd.");
        }
    }
}
