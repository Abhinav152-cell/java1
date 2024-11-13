package Scanner;
import java.util.ArrayList;
public class ArrayListSize {

	public ArrayListSize() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Create an ArrayList of Integer type
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Check and print the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);
	}

}
