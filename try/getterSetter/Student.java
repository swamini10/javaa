package try.getterSetter;

public class Student {
    privat int rollNo;
    private String name;
    Private int age;
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(101);
        s.setName("Swamini");
        s.setAge(20);
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
