//Create a class with multiple constructors and method overloading together.
 public class constructor1{
	
    // Default constructor
    public constructor1() {
        System.out.println("Constructor without parameters");
    }

    // Constructor with 2 parameters
    public constructor1(int a, int b) {
        int add = a + b;
        System.out.println("Addition: " + add);
    }

    // Constructor with 3 parameters
    public constructor1(int a, int b, int c) {
        int mul = a * b * c;
        System.out.println("Multiplication: " + mul);
    }

    // Method overloading
    void display() {
        System.out.println("Display method without parameters");
    }

    void display(int x) {
        System.out.println("Display with one parameter: " + x);
    }

    void display(int x, int y) {
        System.out.println("Display with two parameters: " + (x + y));
    }

    public static void main(String args[]) {
        constructor1 c = new constructor1();
        constructor1 c1 = new constructor1(3, 2);
        constructor1 c2 = new constructor1(3, 2, 1);

        c.display();
        c.display(10);
        c.display(5, 6);
    }
 }