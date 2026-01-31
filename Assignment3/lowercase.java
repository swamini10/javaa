//Check whether a character is lowercase.
import java.util.Scanner;

public class lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character :");
        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            System.out.println(ch+" is in lowercase");
        } else {
            System.out.println(ch+" is Not in lowercase");
        }
		
		/*
		if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch+" is in lowercase");
        } else {
            System.out.println(ch+" is Not in lowercase");
        }
		*/
    }
}