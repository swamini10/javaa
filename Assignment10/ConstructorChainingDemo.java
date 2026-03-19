//Write a program to demonstrate constructor chaining across multiple classes.

class Grandparent {
    Grandparent() {
        System.out.println("Grandparent constructor called");
    }
}

class Parent extends Grandparent {
    Parent() {
        super(); // Calls Grandparent constructor
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls Parent constructor
        System.out.println("Child constructor called");
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}