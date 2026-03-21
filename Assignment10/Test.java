//Write a program that demonstrates constructor inside inner class.

class Outer {
    int x = 10;

    // Inner class
    class Inner {
        // Constructor of inner class
        Inner() {
            System.out.println("Inner class constructor called");
            System.out.println("Value of x from Outer class: " + x);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        // Create outer class object
        Outer outer = new Outer();

        // Create inner class object
        Outer.Inner inner = outer.new Inner();
    }
}