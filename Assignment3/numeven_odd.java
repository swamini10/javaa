//Check whether a number is even or odd
import java.util.Scanner;
public class numeven_odd {
	public static void main (String args []){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number :");
int num = sc.nextInt();
		if (num%2==0){	
			System.out.println(num +" is even ");		
		}else
			System.out.println(num +" is odd");
	}
}
