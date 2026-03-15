//Create a constructor that assigns default values to variables.

class Laptop {
    String brand;
    int price;

    // Constructor assigning default values
    Laptop() {
        brand = "HP";
        price = 45000;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String args[]) {
        Laptop l = new Laptop(); // constructor called automatically
        l.display();
    }
}