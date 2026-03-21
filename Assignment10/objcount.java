//Write a program to demonstrate static variable counting objects created.

public class objcount{
	static int count=1;
	public objcount(){
		System.out.println("objects created "+count +" time");
		count++;
	}
	public static void main(String args[]){
		objcount o = new objcount();
		objcount o1 = new objcount();
		objcount o2 = new objcount();
		objcount o3 = new objcount();
	}
}