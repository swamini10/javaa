// Check whether a character is a digit.

import java.util.Scanner;

public class Checkdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter value : ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println(ch+" Digit");
        } else {
            System.out.println(ch+" Not a digit");
        }
		
		/*
		if (ch >= '0' && ch <= '9') {
       System.out.println("Digit");
     } else {
       System.out.println("Not a digit");
      }
		*/
    }
}
