import java.util.ArrayList;
import java.util.HashSet;
public class ArrayListExample3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");

        // Remove duplicates
        HashSet<String> set = new HashSet<>(list);

        // Convert back to ArrayList
        list = new ArrayList<>(set);

        System.out.println(list);
    }
}