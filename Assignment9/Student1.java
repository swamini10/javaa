//Create constructors for a class Student:
//default
//with name
//with name and marks
public class Student1{
	public Student1(){
		System.out.println("default constructor");
		System.out.println(" ");
	}
	public Student1(String name){
		System.out.println("constructor with name");
		System.out.println("name :"+name);
		System.out.println(" ");
	}
	public Student1(String name,long marks){
		System.out.println("constructor with name and marks");
		System.out.println("name :"+name +"marks :"+marks);
	}
	
	public static void main(String args[]){
		Student1 s1=new Student1();
		Student1 s2=new Student1("Swamini");
		Student1 s3=new Student1("soham",99);
	}
}