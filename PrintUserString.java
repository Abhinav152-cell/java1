package scanner;
import java.util.Scanner;
public class PrintUserString {

	public PrintUserString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Please enter a string: ");
        String userInput = scanner.nextLine();
        
        // Print the entered string
        System.out.println("You entered: " + userInput);
        
        // Close the scanner
        scanner.close();
	}

}