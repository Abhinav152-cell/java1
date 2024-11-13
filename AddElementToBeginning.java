package scanner;
import java.util.LinkedList;
public class AddElementToBeginning {

	public AddElementToBeginning() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 // Create a LinkedList of Integer type
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add some elements to the LinkedList
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original LinkedList: " + numbers);

        // Add an element to the beginning of the LinkedList
        numbers.addFirst(10);

        System.out.println("LinkedList after adding an element to the beginning: " + numbers);
	}

}
