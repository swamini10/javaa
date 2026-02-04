//Check whether a person is senior citizen.


import java.util.Scanner;

public class SeniorCitizenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 60) {
            System.out.println("Person is a Senior Citizen");
        } else {
            System.out.println("Person is not a Senior Citizen");
        }
    }
}