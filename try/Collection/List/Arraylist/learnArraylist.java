import java.util.ArrayList;
import java.util.Iterator;
public class learnArraylist {
	public static void main (String args[]){
		/*
		String [] stud = new String[30];//array withfixsize
		stud[0]="Swamini";		
	    try{
		// now we wont to add new student in it that is 
		stud [30]="raj";// give exception ArrayIndexOutOfBoundsException
		}
		catch (Exception e){
			System.out.println("ArrayIndexOut Of Bounds Exception");
		}
		*/
		
		//simple creat and array list and add element in it
		ArrayList<String> list = new ArrayList<>();// size is not fix we can add so many element in added in it so this is growable 
		list.add("swamini");
		list.add("riya");
		list.add("siya");
		list.add("mira");
		list.add("tara");
		list.add("anvi");
		list.add("isha");
		list.add("kiya");
		list.add("diya");
		list.add("sana");
		list.add("nira");
		list.add("shre");
		list.add("soham");
		System.out.println(list);// this is print bec of toString method 
		
		// function in aarray list 
		
		//if u wont to add an perticular index     
		list.add(12,"swati");
		System.out.println(list);
		
		// get element from list
		System.out.println("Get element at 1 postion :"+list.get(1));
		
		//remove element from list at entered index 
		System.out.println("Remove element from list :"+list.remove(2));
		System.out.println(list);
		
		//remove enter element from list
		System.out.println(list.remove(String.valueOf("soham")));
		System.out.println(list);
		
		//update element at index
		list.set(2,"shriiiiiii");
		System.out.println(list);   // O(1)
		
		//check element is present in list 
		System.out.println(list.contains("diya")); //  O(n)
		
		//clear the list
		list.clear();
		System.out.println(list);
		
		// add to different list in one list 
		ArrayList<String> list1 = new ArrayList<>();
        list1.add("ishaa.x");
		list1.add("meera._xo");
		list1.add("siyaaa._");
		list1.add("anvii._x");
		list1.add("diyaaa.xx");
		list1.add("riya._xo");
		System.out.println("list1 : "+list1);		
		
		list.addAll(list1);//by this way
		
		System.out.println("list after add : ");	
		System.out.println(list);
		
		//  tells the size of current list
		System.out.println(list.size());
		
		//Traverse each element from list
		/*
		Iterate entire list 
		1. by for loop
		2. by for each 
		3. by Iterator
		*/
		
		//by for loop
		System.out.println("\nfor loop :");
		for(int i=0; i< list.size();i++){
		System.out.println("for element :"+list.get(i));
		}
		
		System.out.println("\nfor each :");
		for(String element: list){
		System.out.println("for Each element :"+ element);
			
		}
		
		System.out.println("\nIterator :");
		Iterator<String> li = list.iterator();
		while(li.hasNext()){// until there has a next element it will print 
		System.out.println("Iterator"+li.next());	//next element in the iterator through this function
		}
		
	}
}

/*
    Time complexity : O(n)
*/