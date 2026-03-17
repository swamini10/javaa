//Create a program where one constructor calls another constructor.

public class Demo3{
	public Demo3(){
		System.out.println("constructor without parameter");
	}
	public Demo3(int a){
		this();
		System.out.println("constructor with parameter");
	}
	public static void main(String args[]){
		 Demo3 d= new Demo3(1);
	}
}