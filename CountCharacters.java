package scanner;
import java.util.Scanner;
public class CountCharacters {

	public CountCharacters() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	// Create a Scanner object to take user input
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();

    // Get the length of the string (i.e., the number of characters)
    int length = inputString.length();

    // Display the number of characters
    System.out.println("The number of characters in the string is: " + length);

    // Close the scanner
    scanner.close();
}
}
