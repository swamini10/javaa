// Q10. Write a program in java to delete an element at desired position from an array.
// 	Test Data :
// 	Input the size of array : 5
// 	Input 5 elements in the array in ascending order :
// 	1   2    3    4    5
// 	Input the position where to delete : 3
// 	Expected Output : The new list is : 1 2 3 5
import java.util.Scanner;
public class deleposition{
		public static void main(String args[]){
			Scanner sc =new Scanner (System.in);
		 int array[] = {1, 2, 3, 4, 5};
		 System.out.print("Array :");
		 for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		}
		System.out.println("\n enter the position where to delete:");
		int pos = sc.nextInt();
		
		System.out.println("New Array List :");
		for(int j=0;j<array.length;j++){
			if(j==pos-1){
				continue;
			}
			 System.out.print(array[j] + " ");
		}
	}
}