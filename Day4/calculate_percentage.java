//12.Write a Java program to calculate the total and percentage of 5 subjects using variables

public class calculate_percentage{
	public static void main(String args []){
		int sub1 = 75;
        int sub2 = 80;
        int sub3 = 65;
        int sub4 = 70;
        int sub5 = 85;
		int total =sub1+sub2+sub3+sub4+sub5;
		System.out.println("total: "+total);
		double percentage = (total/500.0)*100;
		System.out.println("percentage: "+percentage);
	}
}