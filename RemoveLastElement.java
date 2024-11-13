package scanner;
import java.util.LinkedList;
public class RemoveLastElement {

	public RemoveLastElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Create a LinkedList of String type
        LinkedList<String> colors = new LinkedList<>();

        // Add some elements to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original LinkedList: " + colors);

        // Remove the last element from the LinkedList
        colors.removeLast();

        System.out.println("LinkedList after removing the last element: " + colors);
	}

}
