// Find the smaller of two numbers.
import java.util.Scanner;
public class smaller_two {
	public static void main (String args []){
Scanner sc = new Scanner(System.in);
System.out.print("enter the 1st number :");
int num1 = sc.nextInt();
System.out.print("enter the 1st number :");
int num2 = sc.nextInt();
	if (num1>= num2){	
			System.out.println(num2 +" is smaller than "+ num1);		
		}else
			System.out.println(num1 +"  is smaller than "+num2);
	}
	
}