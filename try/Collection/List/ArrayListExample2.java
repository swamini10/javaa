import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample2 {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");

        // Print elements
        System.out.println(list);

        //reverse the list
        Collections.reverse(list);
        System.out.println(list);
    }
    
}
