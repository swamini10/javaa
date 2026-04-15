import java.util.Queue;
import java.util.LinkedList;
public class learnQueue {
	public static void main (String args[]){
		Queue<String> q = new LinkedList<>();
		
		//add element in queue
        q.offer("Lion");
        q.offer("Tiger");
        q.offer("Elephant");
        q.offer("Dog");
        q.offer("Cat");

        System.out.println(q);	
       System.out.println(q.poll());	 	
         System.out.println(q);
	}
}

