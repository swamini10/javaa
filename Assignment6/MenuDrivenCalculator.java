//Menu-driven calculator using if-else.
import java.util.Scanner;
public class MenuDrivenCalculator
 {
	public static void main (String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number :");
		int num1 =sc.nextInt();
		System.out.print("Enter second number :");
		int num2 =sc.nextInt();
		System.out.println("Enter option :");
		System.out.println("1. add ");
		System.out.println("2. sub ");
		System.out.println("3. div ");
		System.out.println("4. mul ");
		int op=sc.nextInt();
		
		if(op==1){
				System.out.println(" add : "+(num1+num2) );			
		}
		if(op==2){
				System.out.println(" add : "+(num1-num2) );			
		}
		if(op==3){
				System.out.println(" add : "+(num1*num2) );			
		}
		if(op==4){
				System.out.println(" add : "+(num1/num2) );			
		}
		if(op>4){
				System.out.println(" invalid option ");			
		}
		
		
	}
}