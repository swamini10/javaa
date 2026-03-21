//Create a class that prevents object creation using private constructor (Singleton idea).

class Singleton {

    // Step 1: Create a static instance
    private static Singleton obj = new Singleton();

    // Step 2: Private constructor (prevents object creation from outside)
    private Singleton() {
        System.out.println("Singleton object created");
    }

    // Step 3: Public method to provide access
    public static Singleton getInstance() {
        return obj;
    }
}

// Main class
public class SingletonDemo {
    public static void main(String args[]) {

        // Cannot do this:
        // Singleton s = new Singleton(); ❌ ERROR

        // Access object using method
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Check both references
        if (s1 == s2) {
            System.out.println("Both references point to same object");
        }
    }
}