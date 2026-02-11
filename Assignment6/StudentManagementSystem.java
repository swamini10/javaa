//Student management system (basic).
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        int roll = 0;
        int marks = 0;

        System.out.println("===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            sc.nextLine(); 
            System.out.print("Enter Student Name: ");
            name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            roll = sc.nextInt();

            System.out.print("Enter Marks: ");
            marks = sc.nextInt();

            System.out.println("Student Added Successfully!");
        }
        else if (choice == 2) {
            if (roll == 0) {
                System.out.println("No student data available.");
            } else {
                System.out.println("\nStudent Details:");
                System.out.println("Name: " + name);
                System.out.println("Roll: " + roll);
                System.out.println("Marks: " + marks);
            }
        }
        else if (choice == 3) {
            System.out.println("Program Ended.");
        }
        else {
            System.out.println("Invalid Choice!");
        }
    }
}
