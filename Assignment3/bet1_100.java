//Check whether a number is between 1 and 100.
import java.util.Scanner;
public class bet1_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
        int n = sc.nextInt();
        if (n >= 1 && n <= 100) {
            System.out.println("Valid number "+n+" is between 1 and 100");
        } else {
            System.out.println("Invalid number "+n+" is not between 1 and 100");
        }
    }
}
