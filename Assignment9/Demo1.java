//Write a program demonstrating constructor overloading with 3 constructors.

public class Demo1{
	public Demo1(){
	System.out.println("constructor without parameter");
	}
	public Demo1(int a,int b){
	System.out.println("constructor with two parameter");
	int add=a+b;
	System.out.println(add);
	}
	public Demo1(int a,int b,int c){
	System.out.println("constructor with three parameter");
	int add=a+b+c;
	System.out.println(add);
	}
	public static void main(String args[])
	{
		Demo1 d =new Demo1();
		Demo1 d1 =new Demo1(10,30);
		Demo1 d2 =new Demo1(10,20,30);
	}
}
