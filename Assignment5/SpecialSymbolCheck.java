//Check whether a character is special symbol.

import java.util.Scanner;

public class SpecialSymbolCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (!Character.isLetterOrDigit(ch)) {
            System.out.println("The character is a special symbol.");
        } else {
            System.out.println("The character is not a special symbol.");
        }
    }
}
