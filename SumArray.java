package scanner;
import java.util.Scanner;
public class SumArray {

	public SumArray() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	// Initialize an array with five numbers
    int[] numbers = {5, 10, 15, 20, 25};

    // Variable to store the sum
    int sum = 0;

    // Loop through the array and calculate the sum
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];  // Add each element to sum
    }

    // Print the sum of the numbers
    System.out.println("The sum of the numbers in the array is: " + sum);
}
}
