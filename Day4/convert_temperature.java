// 7.Write a Java program to convert temperature from Celsius to Fahrenheit using variables.
public class convert_temperature{
	public static void main(String args[]){
		
		System.out.println();
		double Celsius=25;
		System.out.println("using double data type");
		System.out.println("temperature in Celsius : "+Celsius+"c");
		System.out.println("convert temperature from Celsius to Fahrenheit:");
		double Fahrenheit=(Celsius * 1.8) + 32;
		System.out.println("temperature in Fahrenheit : "+Fahrenheit+"f");
		System.out.println();
	
		System.out.println("using int data type");
		int Celsius1=25;
		System.out.println("temperature in Celsius : "+Celsius1+"c");
		System.out.println("convert temperature from Celsius to Fahrenheit:");
		int Fahrenheit1=(Celsius1 * 9/5) + 32;
		System.out.println("temperature in Fahrenheit : "+Fahrenheit1+"f");
		
	}
}