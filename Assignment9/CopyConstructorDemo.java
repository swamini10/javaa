//Write a program to clone an object using copy constructor.


class Student {
    int rollNo;
    String name;

    // Parameterized constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Copy constructor
    Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
 
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

public class CopyConstructorDemo {
    public static void main(String args[]) {
        
        // Original object
        Student s1 = new Student(101, "Swamini");
          Student s = new Student(45, "Soham");
        // Cloned object using copy constructor
        Student s2 = new Student(s);

    }
}