//Check whether a character is uppercase.
import java.util.Scanner;

public class uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character :");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println(ch+" is in Uppercase");
        } else {
            System.out.println(ch+" is Not in Uppercase");
        }
		
		/*
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch+" is in Uppercase");
        } else {
            System.out.println(ch+" is Not in Uppercase");
        }
		*/
    }
}
