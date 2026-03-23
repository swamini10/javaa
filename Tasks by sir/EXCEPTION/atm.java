import java.util.Scanner;

public class atm {

    int balance = 80000;
    int originalPin = 1234;

    // Method with Exception Handling
    public void getWithdraw(int amount, int pin)
            throws Exception {

        if (pin != originalPin) {
            throw new Exception("Incorrect PIN!");
        }

        if (amount > balance) {
            throw new Exception("Insufficient Balance!");
			
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {

        atm obj = new atm();
        Scanner sc = new Scanner(System.in);

        int attempts = 3;

        System.out.println("Current Balance: " + obj.balance);
        System.out.print("Enter withdraw amount: ");
        int amount = sc.nextInt();

        while (attempts > 0) {
            try {
                System.out.print("Enter PIN: ");
                int pin = sc.nextInt();

                obj.getWithdraw(amount, pin);
                break; // success → exit loop

            } catch (Exception e) {
                attempts--;
                System.out.println(e.getMessage());
                System.out.println("Attempts left: " + attempts);

                if (attempts == 0) {
                    System.out.println("Account locked due to wrong PIN!");
                }

            }
        }

        sc.close();
    }
}