//Write a program to show constructor calling parent constructor using super().

class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    Child() {
        super(); 
        System.out.println("Child constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}