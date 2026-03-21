//Write a program to clone an object using copy constructor.
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}

public class newMain {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 20);

        Student s2 = new Student(s1);

        System.out.println("Original: " + s1.name + " " + s1.age);
        System.out.println("Clone: " + s2.name + " " + s2.age);
    }
}