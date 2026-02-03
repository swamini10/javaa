//Calculate overtime pay.

import java.util.Scanner;

public class OvertimePay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total hours worked: ");
        int totalHours = sc.nextInt();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = sc.nextDouble();

        int normalHours = 40;
        double overtimePay = 0;

        if (totalHours > normalHours) {
            int overtimeHours = totalHours - normalHours;
            overtimePay = overtimeHours * hourlyRate * 1.5;
        }

        System.out.println("Overtime Pay = Rs." + overtimePay);
    }
}
