//Calculate fine for library late return
import java.util.Scanner;

public class LibraryFine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int days;
		int fine = 0;
		
		System.out.print("Enter number of late days: ");
        days = sc.nextInt();

		
		if(days >= 5){
			fine = days * 1;
		}else if(days >= 10){
			fine = (5 * 1) + (days - 5) * 2;
		}else {
            fine = (5 * 1) + (5 * 2) + (days - 10) * 5;
        }

        System.out.println("Library Fine = Rs. " + fine);
		
	}
}