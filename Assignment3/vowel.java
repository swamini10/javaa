//Check whether a character is a vowel.

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			{
            System.out.println(ch+" is Vowel");
        } else {
            System.out.println(ch+" is Not a vowel");
        }
    }
}
