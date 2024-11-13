package scanner;
import java.util.Scanner;
public class CheckEmptyString {

	public CheckEmptyString() {
		
	}

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        // Read the input string from the user
        String inputString = scanner.nextLine();
        
        // Check if the string is empty
        if (inputString.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is not empty.");
        }
        
        // Close the scanner
        scanner.close();
	}

}
