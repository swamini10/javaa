//Check whether a number lies in a given range.

import java.util.Scanner;
public class CheckRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter lower limit: ");
        int low = sc.nextInt();

        System.out.print("Enter upper limit: ");
        int high = sc.nextInt();

        if (n >= low && n <= high) {
            System.out.println("The number lies within the range.");
        } else {
            System.out.println("The number does not lie within the range.");
        }

        sc.close();
    }
}
