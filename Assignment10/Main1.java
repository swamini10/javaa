//Create a program demonstrating inheritance with constructors

class Animal {
    String name;
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    int age;
    Dog(String name, int age) {
        super(name); 
        this.age = age;
        System.out.println("Dog constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy", 3);
        d.display();
    }
}