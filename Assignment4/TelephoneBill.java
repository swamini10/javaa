//Calculate telephone bill based on calls.

import java.util.Scanner;

public class TelephoneBill{
	public static void main(String[] args){
		int calls;
        double bill;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter calls: ");
        calls = sc.nextInt();

        if (calls <= 100) {
            bill = 200;
        } else if (calls >= 101 && calls <= 150) {
            bill = 200 + (calls - 100) * 0.60;
        } else if(calls <= 200) {
            bill = 200 + (50 * 0.60) + (calls - 150) * 0.50;
        }else {
            bill = 200 + (50 * 0.60) + (50 * 0.50) + (calls - 200) * 0.40;
        }

        System.out.println("Telephone Bill = Rs." + bill);
	}
}