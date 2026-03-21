//Create a class where constructor initializes final variables.
class Student {
    final int rollNo;
    final String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
  
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class FinalVariableDemo {
    public static void main(String[] args) {
        Student s1 = new Student(05, "Swamini");
       
    }
}