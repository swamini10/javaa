//Check whether a character is an alphabet.

import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character :");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
		System.out.println(ch+" is Alphabet");
		} else {
		System.out.println(ch+" is Not an Alphabet");
         }
		
		/*
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println(ch+" is Alphabet");
        } else {
            System.out.println(ch+" is Not Alphabet");
        }
		*/
    }
}