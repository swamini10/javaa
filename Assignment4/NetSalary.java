//Calculate net salary after deductions.

import java.util.Scanner;

public class NetSalary{
    public static void main(String[] args) {
        double basic, hra, da, pf, tax;
        double grossSalary, netSalary;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        basic = sc.nextDouble();

        hra = basic * 0.20;   
        da  = basic * 0.10;   

        grossSalary = basic + hra + da;

        pf  = basic * 0.12;   
        tax = basic * 0.05;  

        netSalary = grossSalary - (pf + tax);

        System.out.println("Gross Salary = Rs. " + grossSalary);
        System.out.println("Total Deductions = Rs. " + (pf + tax));
        System.out.println("Net Salary = Rs. " + netSalary);
    }
}
