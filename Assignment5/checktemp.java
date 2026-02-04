//Check whether temperature is hot, cold, or normal.
 import java.util.Scanner;
public class checktemp{
	public static void main (String args[]){
		    Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if (temp < 20) {
            System.out.println("Temperature is Cold");
        } else if (temp <= 30) {
            System.out.println("Temperature is Normal");
        } else {
            System.out.println("Temperature is Hot");
        }
    }
}