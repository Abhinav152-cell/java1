package scanner;
import java.util.LinkedList;
public class PrintLinkedList {

	public PrintLinkedList() {
		
	}
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		// Create a LinkedList of String type
        LinkedList<String> fruits = new LinkedList<>();

        // Add some elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Print all elements in the LinkedList using a loop
        System.out.println("All elements in the LinkedList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
            
}
	
}
}
