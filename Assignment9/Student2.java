//Write a program that passes object as a parameter to constructor.

public class Student2{
	int a;
	public Student2 (int n){
		 a =n;
		System.out.println("constructor with single parameter ");
	}
	public Student2 (Student2 s){
		a =s.a;
		System.out.println("creating object using constructor with object as parameter");
	}
	//public static void main(String args[]){
	public static void main(String[] args) {
		Student2 stu = new Student2(6);
		Student2 stu1 = new Student2(stu);
	}
}