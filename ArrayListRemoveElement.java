package Scanner;
import java.util.ArrayList;
public class ArrayListRemoveElement {

	public ArrayListRemoveElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Create an ArrayList of String type
        ArrayList<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Original ArrayList: " + fruits);

        // Remove an element by value
        fruits.remove("Banana");

        System.out.println("ArrayList after removing 'Banana': " + fruits);

        // Remove an element by index
        fruits.remove(1); // removes the element at index 1

        System.out.println("ArrayList after removing element at index 1: " + fruits);
	}

}
