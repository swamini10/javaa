// Create a class Employee with constructor parameters name and salary, and display them.

public class Employee {

    public Employee(String name, long salary) {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String args[]) {
        Employee em = new Employee("Shree", 9000);
    }
}