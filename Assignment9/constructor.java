//Write a program to show constructor calling parent constructor using super().
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

 public class constructor extends Parent{
	 public constructor(){
		 super();
		 System.out.println("child constructor");
	 }
	 public static void main(String args[]){
		 constructor c = new constructor();
	 }
 }