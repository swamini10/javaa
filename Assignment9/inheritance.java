//Create a program demonstrating inheritance with constructors.

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // calls Parent constructor
        System.out.println("Child constructor");
    }
}

public class inheritance {
    public static void main(String args[]) {
        Child c = new Child();
    }
}