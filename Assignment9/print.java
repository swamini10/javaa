//Write a program to print a message whenever an object is created.

public class print{
		public print(){
			System.out.println("object is created");
		}
		public static void main(String args[]){
			print p= new print();
			print p1= new print();
			print p2= new print();
			}
}