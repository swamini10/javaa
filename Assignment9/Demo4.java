//Write a program to show difference between local variables and constructor variables.

class Demo4 {
    int num; // instance variable

    // Constructor
    Demo4(int num) {
        this.num = num; // constructor variable assigning to instance variable
    }

    void show() {
        int num = 50; // local variable

        System.out.println("Local variable: " + num);
        System.out.println("Instance variable (from constructor): " + this.num);
    }

    public static void main(String args[]) {
        Demo4 obj = new Demo4(100);
        obj.show();
    }
}