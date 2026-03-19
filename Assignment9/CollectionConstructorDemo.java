//Create a program where constructor initializes a list/coll
import java.util.*;

class StudentList {
    List<String> students;

    StudentList() {
        students = new ArrayList<>();
        students.add("Swamini");
        students.add("Soham");
        students.add("Shree");
    }

    void display() {
        for (String s : students) {
            System.out.println(s);
        }
    }
}

public class CollectionConstructorDemo {
    public static void main(String args[]) {
        StudentList obj = new StudentList();
        obj.display();
    }
}