//Create a program to demonstrate copy constructor.

class Person2 {
    int age;
    String name;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person2(Person2 other) {
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy Constructor Called");
    }


    public static void main(String args[]) {

     
        Person2 p1 = new Person2("Alice", 25);

       
        Person2 p2 = new Person2(p1);

    }
}