//Write a program to show the difference between constructor and method.

class Test1 {

    // Constructor
    Test1() {
        System.out.println("Constructor is called when object is created.");
    }

    // Method
    void show() {
        System.out.println("Method is called using object.");
    }

    public static void main(String args[]) {
        Test1 obj = new Test1(); // Constructor called automatically
        obj.show();            // Method called explicitly
    }
}