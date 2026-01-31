import java.util.Scanner;
public class divisible {
	public static void main (String args []){
Scanner sc = new Scanner(System.in);

System.out.print("Check whether a number is divisible by 5.");
System.out.println("enter the number :");
int num = sc.nextInt();
	if (num % 5 == 0)
    System.out.println(num +" is divisible by 5");
    else
    System.out.println(num +" is not divisible by 5");


System.out.print("Check whether a number is divisible by 11.");

System.out.println("enter the number :");
int num1 = sc.nextInt();
	if (num1 % 11 == 0)
    System.out.println(num1 +" is divisible by 11");
    else
    System.out.println(num1 +" is not divisible by 11");

System.out.print("Check whether a number is a divisible of 3.");

System.out.println("enter the number :");
int num2 = sc.nextInt();
	if (num2 % 3 == 0)
    System.out.println(num2 +" is divisible by 3");
    else
    System.out.println(num2 +" is not divisible by 3");

System.out.print("Check whether a number is a divisible of 10.");

System.out.println("enter the number :");
int num3 = sc.nextInt();
	if (num3 % 10 == 0)
    System.out.println(num3 +" is divisible by 10");
    else
    System.out.println(num3 +" is not divisible by 10");
	}
}
