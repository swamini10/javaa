
//Remove duplicate elements from a list.
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Arrays;
import java.util.LinkedList;
public class Test {
	public static void main (String args[]){
	List<Integer> list = Arrays.asList(1,2,3,2,4,1);
	System.out.println(list);
	// here we only use set bec set not allow duplicate elements
Set<Integer> set = new HashSet<>(list);
  System.out.println(set);
	
	
	// to Maintain order 
	Set<Integer> se = new LinkedHashSet<>(list);
    System.out.println(se);
	
	}
}