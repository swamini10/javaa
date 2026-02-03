//Calculate hostel fee with concession.

import java.util.Scanner;

public class HostelFee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total hostel fee: ");
        double totalFee = sc.nextDouble();

        System.out.print("Enter concession percentage: ");
        double concessionPercent = sc.nextDouble();

        double concessionAmount = totalFee * concessionPercent / 100;
        double finalFee = totalFee - concessionAmount;

        System.out.println("Concession Amount = Rs." + concessionAmount);
        System.out.println("Final Hostel Fee = Rs." + finalFee);
    }
}
