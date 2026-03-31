// Q16.Write a Java program to calculate the average of all elements present in an integer array.
// Explanation
// •	The average of array elements is calculated by:
//  Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}{\text{Number of elements}}Average=Number of elementsSum of all elements
// •	First, iterate through the array and add all elements to a variable sum.
// •	Then divide sum by the total number of elements (array.length) to get the average.
// Input Array:
//  [10, 20, 30, 40, 50]
// Output:
//  Average of array elements = 30
 
 
 public class AveragearrayEle {
	 public static void main(String args[]){
		 int array1[] ={10, 20, 30, 40, 50};
         double sum = 0;
		 System.out.print("Array1 :");
		 for(int j=0;j<array1.length;j++){
			 System.out.print(array1[j] + " ");
             sum = sum + array1[j];
		 }
		 double average =  sum / array1.length;
		 System.out.println("\nAverage of array elements = " + average);
     }		 
 }


