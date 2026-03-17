//Write a program that prints the number of times constructor is called

public class newtest{
	 static int count =1;
	public newtest(){
		System.out.println("constructor is called at "+count +" time");
		count ++;
	}
	public static void main(String args[]){
		newtest n = new newtest();
		newtest n1 = new newtest();
		newtest n2 = new newtest();
		newtest n3 = new newtest();

	}
}