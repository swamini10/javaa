//Write a program to initialize 3 variables using constructor

public class newDemo{
	int var1=12;
	int var2=13;
	int var3=4;
	 public newDemo(){
		
		 System.out.println(var1);
		 System.out.println(var2);
		 System.out.println(var3);
	 }
	public static void main(String args[]){
		newDemo d = new newDemo();
	}
}