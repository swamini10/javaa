//Create a program where constructor initializes a list/collection.

import java.util.ArrayList;
class Student {
    ArrayList<String> subjects;

    Student() {
        subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println("Subjects: " + s.subjects);
    }
}