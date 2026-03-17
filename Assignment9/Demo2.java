//Write a program to show constructor chaining using this().

public class Demo2{
		public Demo2(){	
		System.out.println(" ");
	    System.out.println("constructor without parameter");
		}
		
		public Demo2(int a){
			this(10,30,89);
			System.out.println(" ");
		System.out.println("constructor with single parameter ");
		}
		
		public Demo2(int a,int b){
			System.out.println(" ");
		System.out.println("constructor with two parameter ");
		}
		
		public Demo2(int a,int b,int c){
			System.out.println(" ");
		System.out.println("constructor with three parameter ");
		}
	public static void main(String args[]){
	    Demo2 d =new Demo2();
	    Demo2 d1 =new Demo2(10);
		Demo2 d2 =new Demo2(10,30);
		Demo2 d3 =new Demo2(10,20,30);
	}
}


//notes:
//this() → calls another constructor in the same class
//super() → calls constructor of the parent class