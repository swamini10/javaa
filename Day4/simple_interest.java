//5.Write a Java program to calculate simple interest using variables.

public class simple_interest{
	public static void main(String args[]){
		int Principal=12000;
		int Rateofinterest=10;
		int Time=2;
		int SimpleInterest=(Principal*Rateofinterest*Time)/100;
		System.out.println("Simple Interest :"+SimpleInterest);
	}
}