//Calculate total, percentage, and grade of 5 subjects.
import java.util.Scanner;

public class Calper{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the mark of Math:");
		int math = sc.nextInt();
		System.out.println("Enter the mark of Oomd:");
		int oomd = sc.nextInt();
		System.out.println("Enter the mark of Spm:");
		int spm = sc.nextInt();
		System.out.println("Enter the mark of Cns:");
		int cns = sc.nextInt();
		System.out.println("Enter the mark of Ai:");
		int Ai = sc.nextInt();
		
		double total = math + oomd + spm + cns + Ai;
		System.out.println("Total Mark: "+total);
		
		double per = (total/500) * 100;
		System.out.println("percentage: "+per +"%");
		
		if(per >= 75 && per <=100){
			System.out.println("Distinction");
		}else if(per >= 60){
			System.out.println("A Grade");
		}else if(per >= 50){
			System.out.println("B Grade");
		}else if(per >= 40){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		
		
	}
}