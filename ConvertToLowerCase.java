package scanner;
import java.util.Scanner;
public class ConvertToLowerCase {

	public ConvertToLowerCase() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lowercase
        String lowercaseString = inputString.toLowerCase();

        // Display the result
        System.out.println("Lowercase version: " + lowercaseString);

        // Close the scanner
        scanner.close();
    }

	}

