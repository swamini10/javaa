//Result processing system.
import java.util.Scanner;
public class Resultproces{
	  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 3 subjects (out of 100):");
        System.out.print("Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (m1 >= 35 && m2 >= 35 && m3 >= 35) {
            System.out.println("Status: Pass");

            if (percentage >= 80) {
                System.out.println("Grade: A");
            } else if (percentage >= 60) {
                System.out.println("Grade: B");
            } else if (percentage >= 50) {
                System.out.println("Grade: C");
            } else if (percentage >= 35) {
                System.out.println("Grade: D");
            }

        } else {
            System.out.println("Status: Fail");
            System.out.println("Grade: F");
        }
    }
}
