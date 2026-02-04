//Validate username and password.
import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String corUsername = "nikita";
        String corPassword = "12345";

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(corUsername) && password.equals(corPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }

    }
}