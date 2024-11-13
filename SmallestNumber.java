package scanner;
import java.util.Scanner;
public class SmallestNumber {

	public SmallestNumber() {
		
	}
	public static void main(String[] args) {
		// Initialize an array of numbers
        int[] numbers = {45, 22, 89, 5, 77, 12};

        // Assume the first element is the smallest
        int smallest = numbers[0];

        // Loop through the array to find the smallest number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update smallest if a smaller number is found
	}

}
}
	}