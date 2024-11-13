package scanner;
import java.util.Scanner;
public class ConcatenateStrings {

	public ConcatenateStrings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the two strings
        String concatenatedString = firstString + secondString;

        // Display the concatenated result
        System.out.println("The concatenated string is: " + concatenatedString);

        // Close the scanner
        scanner.close();

	}

}
