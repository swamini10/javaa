
// Online exam evaluation system.
import java.util.Scanner;

class Question {
    String question;
    String[] options;
    int correctAnswer;

    Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class exam_evaluation {  // Class name changed to match filename

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questions
        Question[] quiz = new Question[] {
            new Question("What is the capital of India?", new String[] {"1) Mumbai", "2) New Delhi", "3) Bangalore", "4) Chennai"}, 2),
            new Question("Which language runs on the JVM?", new String[] {"1) Python", "2) C#", "3) Java", "4) C++"}, 3),
            new Question("What is 5 + 3?", new String[] {"1) 7", "2) 8", "3) 10", "4) 6"}, 2)
        };

        int score = 0;

        System.out.println("=== Welcome to Online Exam ===");

        // Loop through questions
        for (int i = 0; i < quiz.length; i++) {
            System.out.println("\nQ" + (i+1) + ": " + quiz[i].question);
            for (String opt : quiz[i].options) {
                System.out.println(opt);
            }

            System.out.print("Your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == quiz[i].correctAnswer) {
                score++;
            }
        }

        // Display result
        System.out.println("\n=== Result ===");
        System.out.println("Your Score: " + score + "/" + quiz.length);

    }
}
