//Check whether employee is permanent or temporary

import java.util.Scanner;

public class EmployeeType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();

        if (experience >= 2) {
            System.out.println("Employee is Permanent");
        } else {
            System.out.println("Employee is Temporary");
        }

    }
}