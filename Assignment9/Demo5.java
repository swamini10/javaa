//Write a program to demonstrate constructor overloading using different data types

class Demo5 {
    int a;
    float b;
    String c;

    // Constructor with int
    Demo5(int x) {
        a = x;
        System.out.println("Integer value: " + a);
    }

    // Constructor with float
    Demo5(float y) {
        b = y;
        System.out.println("Float value: " + b);
    }

    // Constructor with String
    Demo5(String z) {
        c = z;
        System.out.println("String value: " + c);
    }
    public static void main(String[] args) {
        // Calling different constructors
        Demo5 d1 = new Demo5(10);
        Demo5 d2 = new Demo5(5.5f);
        Demo5 d3 = new Demo5("Hello");
    }
}