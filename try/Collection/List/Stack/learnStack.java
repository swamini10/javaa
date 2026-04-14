import java.util.Stack;
public class learnStack {
	public static void main (String args[]){
		Stack<String> s = new Stack<>();		
s.push("Mango");
s.push("Apple");
s.push("Banana");
s.push("Orange");
s.push("Grapes");
s.push("Pineapple");
s.push("Strawberry");
s.push("Watermelon");
s.push("Papaya");
s.push("Kiwi");
System.out.println(s);

		// to check top element
        System.out.println("Top: " + s.peek());
		 
        //remove element from list 
        System.out.println("Removed: " + s.pop());
		System.out.println(s);
        System.out.println("Removed: " + s.pop());
		System.out.println(s);
		
		// check size 
        System.out.println("Size: " + s.size());
		
		//check stack is empty or not
        System.out.println("Is Empty: " + s.isEmpty());
	}
}