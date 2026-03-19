//Create a class with private constructor and test object creation.

public class main{
		private main(){
		System.out.println("private constructor");
		}
		public static void main(String args[]){
			main m=new main();
		}
}