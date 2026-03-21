//Create a class with private constructor and test object creation.
public class demo {
    private demo() {
        System.out.println("Private constructor called");
    }

    public static void main(String[] args) {
        // Attempting to create an object of Demo will result in a compilation error
        // because the constructor is private.
         demo obj = new demo();
    }
}