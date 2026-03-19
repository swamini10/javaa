//Write a program where child constructor calls both super() and this().
//note In Java, a constructor can call either super() OR this(), but not both directly in the same constructor.

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {

    Child() {
        super(); 
        System.out.println("Child default constructor");
    }

    Child(int x) {
        this(); // calls Child() constructor
        System.out.println("Child parameterized constructor");
    }
}

public class ConstructorDemo {
    public static void main(String args[]) {
        Child obj = new Child(10);
    }
}