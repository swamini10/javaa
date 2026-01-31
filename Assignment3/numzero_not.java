// Check whether a number is zero or not.

import java.util.Scanner;
public class numzero_not {
	public static void main (String args []){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number :");
int num = sc.nextInt();
	if (num == 0)
    System.out.print("Number is zero");
else
    System.out.print("Number is not zero");

	}
}