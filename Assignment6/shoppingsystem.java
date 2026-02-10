//Online shopping system using if-else.

import java.util.Scanner;
public class shoppingsystem {
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to Online Shopping System =====");
        System.out.println("1. Laptop - $800");
        System.out.println("2. Mobile - $500");
        System.out.println("3. Headphones - $100");
        System.out.println("4. Smart Watch - $200");

        System.out.print("Enter your choice (1-4): ");
       int choice = sc.nextInt();
	    System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
		
		
		int price;
        if (choice == 1) {
            price = 800;
        } 
		if (choice == 2) {
            price = 500;
        } 
		if (choice == 3) {
            price = 100;
        } 
		if (choice == 4) {
            price = 200;
        } 
        if (choice > 4) 	{
            System.out.println("Invalid choice!");
            return;
        }

        int total = price * quantity;

        System.out.println("Price per item: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total amount to pay: $" + total);

        System.out.println("Thank you for shopping with us!");
       
    }
	}
