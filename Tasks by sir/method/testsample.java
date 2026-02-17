
import java.util.Scanner;
public class testsample extends samplepatters{
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        testsample ts = new testsample();   // Your pattern class
        int choice;
        
        do {
            System.out.println("\n===== PATTERN MENU =====");
            System.out.println("1. Pyramid");
            System.out.println("2. Reverse Pyramid");
            System.out.println("3. Diamond");
            System.out.println("4. Number Pattern");
            System.out.println("5. Character Pattern");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    ts.getPyramid(5);
                    break;
                    
                case 2:
                    ts.getReversePyramid(5);
                    break;
                    
                case 3:
                    ts.getDiamond(5);
                    break;
                    
                case 4:
                    ts.getNumberPattern(5);
                    break;
                    
                case 5:
                    ts.getCharPattern(5);
                    break;
                    
                case 6:
                    System.out.println("Exiting program...");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Try again.");
            }
            
        } while(choice != 6);  
    }
}
