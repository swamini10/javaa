//Write a program showing constructor execution order in inheritance.
class A {
    A() {
        System.out.println("Constructor of class A");
    }
}

class B extends A {
    B() {
        System.out.println("Constructor of class B");
    }
}

class C extends B {
    C() {
        System.out.println("Constructor of class C");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        C obj = new C();
    }
}