// Write a java program to search an element in an array , its element found or not.
// Input:
//  Array = {10, 20, 30, 40, 50}
//  Element to search = 30
// Output : Element 30 found at index 2
// Explanation :
// We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
import java.util.Scanner;
public class searchele{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array :");
		int i = sc.nextInt();
		int [] arr = new int[i];
	System.out.print("enter "+i+" element in array :");
	for(int j=0;j<arr.length;j++){
		arr[j]=sc.nextInt();
	}
	System.out.print("enter Search element");
	int search=sc.nextInt();
	boolean found = false;
	for(int j=0;j<arr.length;j++){
		if(arr[j]== search){
			System.out.print("Element "+ search +"found at index "+j );
		  found = true;
                break;
		}
	}    if (!found)
	System.out.println("Element " + search + " not found");
	}
}