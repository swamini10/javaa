//Create a class where constructor accepts another object.
public class person{
int age;
String name;
public person(int age,String name){
	    this.name = name;
        this.age = age;
	}
	public person(person other){
		 this.name = other.name;
        this.age = other.age;
	}
	public static void main(String args[]){
		   person p1 = new person(25,"Alice"); 

        // Second object created using first object
        person p2 = new person(p1);

        System.out.println(p2.name); // Alice
        System.out.println(p2.age);  // 25
	}
}