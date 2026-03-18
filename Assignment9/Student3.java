//Write a program to create 5 objects using constructor and display their values.

class Student3 {
    int id;
    String name;

    Student3(int i, String n) {
        id = i;
        name = n;
		 System.out.println("ID: " + id + ", Name: " + name);
    }


    public static void main(String[] args) {
        Student3 s1 = new Student3(1, "Swamini");
        Student3 s2 = new Student3(2, "Soham");
        Student3 s3 = new Student3(3, "Priya");
        Student3 s4 = new Student3(4, "Neha");
        Student3 s5 = new Student3(5, "krishna");

    }
}