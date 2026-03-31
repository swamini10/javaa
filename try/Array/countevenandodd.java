// Q17. Write a Java program to count the number of even and odd elements present in a given integer array.
// Explanation
// •	An even number is a number that is completely divisible by 2.
// •	An odd number is a number that is not divisible by 2.
// •	Traverse the array using a loop.
// Input :- Array = { 10, 15, 20, 25, 30 }
// Output :- Even count = 3
//     Odd count = 2
	
public class countevenandodd{
	public static void main(String args[]){
		 int array1[] ={10, 15, 20, 25, 30};
		 System.out.print("Array1 :");
		 int Even=0;
		 int Odd=0;
		 for(int j=0;j<array1.length;j++){
			 System.out.print(array1[j] + " ");
			 if(array1[j]%2==0){
				 Even++;
			 }else
				 Odd++;
		 }
		System.out.print("\nEven :"+Even); 
		System.out.print("\nOdd :"+Odd);
	}
}
