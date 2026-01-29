//14.	Write a Java program to convert days into years, weeks, and days using variables.

public class DaysConversion {
    public static void main(String[] args) {

        // Given number of days
        int totalDays = 730;

        // Calculate years, weeks, and days
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        // Display result
        System.out.println("Total Days = " + totalDays);
        System.out.println("Years = " + years);
        System.out.println("Weeks = " + weeks);
        System.out.println("Days = " + days);
    }
}
