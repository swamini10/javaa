//Create a constructor that calculates and prints the square of a number.

public class square1{
	public square1(int num){
		int squ = num*num;
		System.out.println("Square of "+ num +" is "+ squ +".");
	}
	public static void main(String args[]){
		square1 sq = new square1(5);
		square1 sq1 = new square1(2);
		square1 sq2 = new square1(3);
	}
}