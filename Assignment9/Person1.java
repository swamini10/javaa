
class Person1 {
    int age;
    String name;

    // Parameterized Constructor (Changing Constructor)
    Person1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    // Copy Constructor
    Person1(Person1 other) {
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy Constructor Called");
    }


    public static void main(String args[]) {

        // Using parameterized constructor
        Person1 p1 = new Person1("Alice", 25);

        // Using copy constructor
        Person1 p2 = new Person1(p1);

    }
}