/*public class pattern1{
	public static void main(String [] args){
		int n=4;
		for(int i=1;i<=n;i++){
			  for(int s=1;s<=n-i;s++){
			   System.out.print(" "); 
			  }
			    for(int j=1;j<=i;j++){	
				System.out.print(" "+j); 
			} 
			System.out.println(); 
		}
		
	}
}
o/p:
    1
   1 2
  1 2 3
 1 2 3 4
 */
 
 /*
 public class pattern1{
	public static void main(String [] args){
		int n=4;
		for(int i=n;i>=1;i--){
			  for(int s=1;s<=n-i;s++){
			   System.out.print(" "); 
			  }
			    for(int j=1;j<=i;j++){	
				System.out.print(" *"); 
			} 
			System.out.println(); 
		}
		
	}
}
o/p
 * * * *
  * * *
   * *
    *

*/

/*
public class pattern1{
	public static void main(String [] args){
		int n=4;
		for(int i=1;i<=n;i++){
			  for(int s=1;s<=n-i;s++){
			   System.out.print(" "); 
			  }
			    for(int j=1;j<=i;j++){	
				System.out.print(" *"); 
			} 
			System.out.println(); 
		}
		
	}
}
o/P
    *
   * *
  * * *
 * * * *
 
 */
 /*
 public class pattern1{
	public static void main(String [] args){
		char n= 'd';
		for(char i='a';i<=n;i++){
			  for(int s=1;s<=n-i;s++){
			   System.out.print(" "); 
			  }
			    for(char j='a';j<=i;j++){	
				System.out.print(" "+j); 
			} 
			System.out.println(); 
		}
	}
}
    a
   a b
  a b c
 a b c d
 */
 /*
 
public class pattern1{
	public static void main(String [] args){
		int n=4;
		for(int i=1;i<=n;i++){
			  for(int s=1;s<=n-i;s++){
			   System.out.print(" "); 
			  }
			  char c='a';
			    for(int j=1;j<=i;j++){	
				System.out.print(" "+c); 
				c++;
			} 
			System.out.println(); 
		}
		
	}
}
    a
   a b
  a b c
 a b c d
 */
  /*
public class pattern1{
	public static void main(String [] args){
		int n=4;
		for(int i=1;i<=n;i++){
			  for(int s=1;s<=n-i;s++){
			   System.out.print(" "); 
			  }
			  char c='a';
			    for(int j=1;j<=i;j++){	
				if(i%2==0){
					System.out.print(" "+c); 
				c++;
				}else
					System.out.print(" "+j); 
			} 
			System.out.println(); 
		}
		
	}
}
    1
   a b
  1 2 3
 a b c d
 */
 
 public class pattern1{
	public static void main(String [] args){
		int n=4;
		for(int i=1;i<=n;i++){
			 System.out.print("");
			  for(int s=1;s<=n-i;s++){
			   System.out.print(" "); 
			  }
			   System.out.print("*");
			    for(int j=1;j<=i;j++){	
				System.out.print(" "+j); 
			} System.out.print(" *");
			System.out.println(); 
			
			
		}
		
	}
}