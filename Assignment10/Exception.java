////Create a class where constructor throws an exception if value is negative

public class Exception {
    private int value;

   
    public Exception(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Exception obj1 = new Exception(10);
        System.out.println("Value: " + obj1.getValue());

        Exception obj2 = new Exception(-5);
    }
}