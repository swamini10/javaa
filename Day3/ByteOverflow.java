//7.Write a program to show overflow in byte data type

public class ByteOverflow {
    public static void main(String[] args) {
        // Get max and min values of byte
        byte max = 127;
        // Overflow: increment the max value
        max++;
        System.out.println("After max++ (overflow): " + max);
    }
}
