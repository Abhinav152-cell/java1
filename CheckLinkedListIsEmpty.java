package scanner;
import java.util.LinkedList;
public class CheckLinkedListIsEmpty {

	public CheckLinkedListIsEmpty() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Create a LinkedList of Integer type
        LinkedList<Integer> numbers = new LinkedList<>();

        // Check if the LinkedList is empty
        if (numbers.isEmpty()) {
            System.out.println("The LinkedList is empty.");
        } else {
            System.out.println("The LinkedList is not empty.");
        }

        // Add an element to the LinkedList
        numbers.add(10);

        // Check again if the LinkedList is empty
        if (numbers.isEmpty()) {
            System.out.println("The LinkedList is empty.");
        } else {
            System.out.println("The LinkedList is not empty.");
	}

}
}
