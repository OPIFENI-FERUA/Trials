import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> set = new HashSet<>();
        
        // Add elements to the HashSet
        set.add("Goats");
        set.add("Hen");
        set.add("Cow");
        set.add("Hen");  // This is a duplicate and will not be added

        // Display the elements
        for (String item : set) {
            System.out.println(item);
        }

        // Check if an element exists
        if (set.contains("Goats")) {
            System.out.println("Goat is in the set");
        }

        // Remove an element
        set.remove("Cow");

        // Display the HashSet after removal
        System.out.println("After removal:");
        for (String item : set) {
            System.out.println(item);
        }
    }
}
