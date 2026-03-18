//Write a program to initialize student marks and calculate average using constructor.

public class Student4 {
    int m1, m2, m3;
    double average;

    Student4(int a, int b, int c) {
        m1 = a;
        m2 = b;
        m3 = c;
        average = (m1 + m2 + m3) / 3.0;
		System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Average: " + average);
    }
    public static void main(String[] args) {
        Student4 s1 = new Student4(85, 90, 80);
    }
}