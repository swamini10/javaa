//Create a program that calculates simple interest using constructor
import java.util.Scanner;

public class simpleinterest {
    double p, r, t, si;

    simpleinterest() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        r = sc.nextDouble();

        System.out.print("Enter Time: ");
        t = sc.nextDouble();

        si = (p * r * t) / 100;

        System.out.println("Simple Interest = " + si);
    }

    public static void main(String[] args) {
        simpleinterest obj = new simpleinterest(); // constructor called
        
    }
}