import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        
        // Adding key-value pairs to the HashMap
        map.put("Goats", 100);
        map.put("Hen", 200);
        map.put("Cow", 30);

        // Accessing a value associated with a key
        int value = map.get("Hen");
        System.out.println("Hen = " + value);

        // Iterating through the HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + " = Value: " + map.get(key));
        }
    }
}
