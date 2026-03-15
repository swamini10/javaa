// Write a program that creates multiple objects using the same constructor

public class Test {
    String name;
    int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name );
        System.out.println( " Age: " + age);
		
        System.out.println("*****************");
    }

    public static void main(String args[]) {
        // Creating multiple objects using the same constructor
        Test t1 = new Test("Riya", 20);
        Test t2 = new Test("Aman", 22);
        Test t3 = new Test("Neha", 21);
    }
}