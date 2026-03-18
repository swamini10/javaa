//Create a constructor that accepts user input and stores it in variables.

import java.util.Scanner;

class Student5 {
    int id;
    String name;

    Student5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.println("----------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student5 s1 = new Student5();
    }
}