//13.	Write a Java program to demonstrate local, instance, and static variables

public class VariablesDemo {

    // Instance variable
    int instanceVar = 20;

    // Static variable
    static int staticVar = 30;

    public void display() {
        // Local variable
        int localVar = 10;
		
        System.out.println("Local Variable = " + localVar);
        System.out.println("Instance Variable = " + instanceVar);
    }

    public static void main(String[] args) {
        VariablesDemo obj = new VariablesDemo();
        obj.display();	
		 System.out.println("Instance Variable = " +   obj.instanceVar);
        System.out.println("Static Variable = " + staticVar);
    }
}
