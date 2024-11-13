package Scanner;
import java.util.ArrayList;
public class PrintArrayList {

	public PrintArrayList() {
		
	}

	public static void main(String[] args) {
		// Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // Add some names to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Loop through the ArrayList and print each element
        System.out.println("The names in the ArrayList are:");
        for (String name : names) {
            System.out.println(name);
	}

}
}
