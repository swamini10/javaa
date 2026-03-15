// Program to demonstrate constructor initialization of instance variables

public class Demo {
    String name;
    int marks;

    public Demo(String name, int marks) {
        this.name = name;
        this.marks = marks;

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Demo d = new Demo("Swamini", 85);
    }
}