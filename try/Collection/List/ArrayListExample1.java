import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String args[]){
		ArrayList<Object>ArrayList = new ArrayList<>();
		
		ArrayList.add(12);
		ArrayList.add(9.0);
        ArrayList.add("swamini");
        ArrayList.add("soham");
        ArrayList.add(true);

        System.out.println(ArrayList);

         // Update element (index 1 → 12 → Orange)
        ArrayList.set(1, "Orange");
        System.out.println(ArrayList);

            // Remove element (index 1 → "swamini")
        ArrayList.remove(1);
        System.out.println(ArrayList);
    }
		  
}
