//Check whether age is in teenage range


import java.util.Scanner;

public class TeenageCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 13 && age <= 19) {
            System.out.println("Age is in the teenage range");
        } else {
            System.out.println("Age is not in the teenage range");
        }
    }
}