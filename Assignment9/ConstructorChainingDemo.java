//Write a program to demonstrate constructor chaining across multiple classes.

// Base class
class Grandparent {
    Grandparent() {
        System.out.println("Grandparent constructor called");
    }
}

class Parent {
    Parent() {
        Grandparent g= new Grandparent();
        System.out.println("Parent constructor called");
    }
}

class Child {
    Child() {
        Parent p = new Parent();
        System.out.println("Child constructor called");
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}