//9.	Write a Java program to calculate the perimeter of a circle using radius as a variable.

public class PerimeterOfCircle {
    public static void main(String[] args) {

        // Declare radius variable
        double radius = 7;

        // Calculate perimeter (circumference)
        double perimeter = 2 * Math.PI * radius;

        // Display result
        System.out.println("Radius = " + radius);
        System.out.println("Perimeter of Circle = " + perimeter);
    }
}
