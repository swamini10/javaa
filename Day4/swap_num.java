/* 4.	Write a Java program to swap two variables
a) Using a third variable
b) Without using a third variable*/

public class swap_num{
	public static void main(String [] args){
		int num1=2;
		int num2=8;
		System.out.println("num1:"+num1);
	    System.out.println("num2:"+num2);
		System.out.println();
		// Without using a third variable
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("swap Without using a third variable");
	    System.out.println("num1:"+num1);
	    System.out.println("num2:"+num2);
		System.out.println();

		num1=num1*num2;
		num2=num1/num2;
		num1=num1/num2;
		System.out.println("swap Without using a third variable");
	    System.out.println("num1:"+num1);
	    System.out.println("num2:"+num2);
		System.out.println();
		
		// Using a third variable 
		int temp = num1;
		num1=num2;
		num2=temp;
		System.out.println("swap Using a third variable");
		System.out.println("num1:"+num1);
	    System.out.println("num2:"+num2);
		
		
	}
}