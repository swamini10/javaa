//Simple ATM system using if-else.

import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000; // initial balance
        int choice;

        System.out.println("===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Your current balance is: " + balance);
        }
        else if (choice == 2) {
            System.out.print("Enter amount to deposit: ");
            double deposit = sc.nextDouble();

            if (deposit > 0) {
                balance = balance + deposit;
                System.out.println("Amount deposited successfully.");
                System.out.println("Updated balance: " + balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
        else if (choice == 3) {
            System.out.print("Enter amount to withdraw: ");
            double withdraw = sc.nextDouble();

            if (withdraw > 0 && withdraw <= balance) {
                balance = balance - withdraw;
                System.out.println("Please collect your cash.");
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }
        else if (choice == 4) {
            System.out.println("Thank you for using the ATM.");
        }
        else {
            System.out.println("Invalid choice!");
        }

    }
}
