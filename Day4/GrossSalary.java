//15.	Write a Java program to calculate gross salary using basic salary and allowance variables

public class GrossSalary {
    public static void main(String[] args) {

        // Declare variables
        double basicSalary = 20000;
        double allowance = 5000;

        // Calculate Gross Salary
        double grossSalary = basicSalary + allowance;

        // Display result
        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("Allowance = " + allowance);
        System.out.println("Gross Salary = " + grossSalary);
    }
}
