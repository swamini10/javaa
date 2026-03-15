//Create a class Car with a constructor that initializes brand and price.

public class Car{
	
	public Car( String brand, double price){
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
	}
	public static void main(String args[]){
		Car Car = new Car("Toyota", 20000.0);
	}
}