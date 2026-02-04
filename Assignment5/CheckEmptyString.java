//Check whether a string is empty.

import java.util.Scanner;

public class CheckEmptyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is not empty.");
        }
    }
}
