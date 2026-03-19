//Create a class where constructor throws an exception if value is negative.


public class NumberCheck {
	NumberCheck(int num){
		if(num <0){
			System.out.println("number is negative");
		}else 
			System.out.println("number is "+num);
	}
	public static void main(String args[]){
		NumberCheck n= new NumberCheck(10);
		NumberCheck n1= new NumberCheck(-10);
	}
}