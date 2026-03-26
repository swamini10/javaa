//  Write a program in java to insert an element at desired position from an array.
// 	Test Data :
// 	Input the size of array : 6
// 	Input 5 elements in the array in ascending order : 	1   2    3    4    5
// 	Input the position where to insert : 2
// 	Value :      200
// 	Expected Output : The new list is : 1 2 200 3 4 5
	import java.util.Scanner;
	public class insertanelement{
		public static void main(String args[]){
			Scanner sc =new Scanner (System.in);
			System.out.print("Enter array element :");
			int n = sc.nextInt();
			int[] arr = new int[n + 1];
		System.out.println("Enter "+n+" elements in array :");
		for (int j = 0; j < n; j++){
			arr[j]=sc.nextInt();
		}
		System.out.print("Enter position where to insert :");
		int pos =sc.nextInt();	
		System.out.print("Enter the value :");
		int value  =sc.nextInt();	
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;
        n++;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
           }
		}
	}
