

import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
public class Test {
	public static void main (String args[]){
		/* 
		//Remove duplicate elements from a list.
	List<Integer> list = Arrays.asList(1,2,3,2,4,1);
	System.out.println(list);
	// here we only use set bec set not allow duplicate elements
   Set<Integer> set = new HashSet<>(list);
  System.out.println(set);
	
	
	// to Maintain order 
	Set<Integer> se = new LinkedHashSet<>(list);
    System.out.println(se);
	*/
	/*
	//Find Frequency of Elements
	  int[] arr = {1, 2, 2, 3, 1, 4, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
		*/
		
		//Sort a List
		
	  int[] arr = {9, 6, 7, 3, 1, 4, 2};
        List<Integer> list = new ArrayList<>();
        // Add elements to list
        for (int num : arr) {
            list.add(num);
        }
        // Ascending sort
        Collections.sort(list);
        System.out.println("Ascending: " + list);
        // Descending sort
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending: " + list);
    
	}
}