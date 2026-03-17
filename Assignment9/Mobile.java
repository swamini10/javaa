//Create a class Mobile with constructor parameters model and price
public class Mobile{
	public Mobile (String model,long price){
		System.out.println("model:"+model);
		 System.out.println("price:"+price);
	}
	public static void main(String args[]){
		Mobile m =new Mobile("Redmi",34000);
	}
}