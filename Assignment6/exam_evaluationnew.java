//// Online exam evaluation system.
import java.util.Scanner;
public class exam_evaluationnew {
	public static void main(String args[]){
		  int score = 0; 
		Scanner sc= new Scanner(System.in);
		System.out.println();
		System.out.println("Q1. give correct ans of the following Que:");
		System.out.println();
		System.out.println("What does JVM stand for?");
		System.out.println("1) Java Variable Manager");
		System.out.println("2) Java Value Module");
		System.out.println("3) Java Virtual Machine");
		System.out.println("4) Java Version Manager");
		System.out.print("Enter your answer :");
		int Ans1=sc.nextInt();
		
		System.out.println("Q2. Which method is the entry point of any Java application?");
		System.out.println("1) start()");
		System.out.println("2) init()");
		System.out.println("3) run()");
		System.out.println("4) main()");
		System.out.print("Enter your answer :");
		int Ans2=sc.nextInt();
		
		System.out.println("Q3. Who is the inventor of Java?");
		System.out.println("1) James Gosling");
		System.out.println("2) Mark Jukervich");
		System.out.println("3) Dennis Ritchie");
		System.out.println("4) Steve Jobs");
		System.out.print("Enter your answer :");
		int Ans3=sc.nextInt();
		
		 System.out.println("Q4. Which component is required to run a Java program?");
System.out.println("1) JDK");
System.out.println("2) JRE");
System.out.println("3) JVM Compiler");
System.out.println("4) IDE");
System.out.print("Enter your answer :");
int Ans4=sc.nextInt();  


System.out.println("Q5. Which of the following is a Java keyword?");
System.out.println("1) main");
System.out.println("2) system");
System.out.println("3) class");
System.out.println("4) include");
System.out.print("Enter your answer :");
int Ans5=sc.nextInt();   
		if(Ans1==3){
		System.out.println("Q1 correct");
		score++;
		}else{
		System.out.println("Q1 Wrong Answer");
		}
		if(Ans2==4){
		System.out.println("Q2 correct");
		score++;
		}else{
		System.out.println("Q2 Wrong Answer");
		}
		if(Ans3==1){
		System.out.println("Q3 correct");
		score++;
		}else{
		System.out.println("Q3 Wrong Answer");
		}
		if(Ans4==2){
		System.out.println("Q4 correct");
		score++;
		}else{
		System.out.println("Q4 Wrong Answer");
		}
		if(Ans5==3){
		System.out.println("Q5 correct");
		score++;
		}else{
		System.out.println("Q5 Wrong Answer");
		}
		
		System.out.println("\n===== RESULT =====");
        System.out.println("Total Score: " + score + " / 5");
	}
}
