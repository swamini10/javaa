//Write a program demonstrating constructor in abstract class.

abstract class Animal {

    Animal() {
        System.out.println("Animal constructor called");
    }

    abstract void sound();
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog constructor called");
    }

    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractConstructor {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.sound();
    }
}