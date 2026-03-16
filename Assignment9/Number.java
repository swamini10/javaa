//Write a program to demonstrate constructor overloading with 2 constructors.

public class Number{
		public Number(){
			System.out.println("constructor without parameter");
		}
		public Number(int a,int b){
		 int add=a+b;
		 System.out.println("Addition :"+ add);
		}
	public static void main(String args[]){
	   Number num = new Number();
	   Number num1 = new Number(10,30);
	}
}