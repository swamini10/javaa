//Write a program to demonstrate static variable counting objects created.

public class countobj{
	static int count=1;
	public countobj(){
		System.out.println(count+" objects created");
		count ++;
	}
	public static void main(String args[]){
		countobj c= new countobj();
		countobj c1= new countobj();
		countobj c2= new countobj();
		countobj c3= new countobj();
		countobj c4= new countobj();
		countobj c5= new countobj();
	}
}