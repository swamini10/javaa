//Check whether a number is positive or negative.
import java.util.Scanner;
public class numpos_neg {
	public static void main (String args []){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number :");
int num = sc.nextInt();
		if (num>=0){	
			System.out.println(num +" is positive ");		
		}else
			System.out.println(num +" is negative");
	}
}
