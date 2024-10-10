import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Goats");
        list.add("Hen");
        list.add("Cow");

        // Remove element
        list.remove("Hen");

        // Access an element
        String fruit = list.get(1);

        // Display the elements
        for (String item : list) {
            System.out.println(item);
        }
    }
}
