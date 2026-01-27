//10. Write a program to differentiate primitive and non-primitive data types.

public class DataTypeDemo {
    public static void main(String[] args) {
        int num = 10;             
        double price = 99.99;      
        char letter = 'A';       
        boolean flag = true;     
        String text = "Hello Java";  
        System.out.println("--- Primitive Data Types ---");
        System.out.println("int value: " + num);
        System.out.println("double value: " + price);
        System.out.println("char value: " + letter);
        System.out.println("boolean value: " + flag);

        System.out.println("\n--- Non-Primitive Data Types ---");
        System.out.println("String value: " + text);
        
    }
}
