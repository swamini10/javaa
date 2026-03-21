.
public class Exception1 {
    private int value;

    public Exception1(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.value = value;
    }
    public static void main(String[] args) {
        try {
            Exception1 obj1 = new Exception1(10);
            System.out.println("Object created with value 10");

            Exception1 obj2 = new Exception1(-5); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}