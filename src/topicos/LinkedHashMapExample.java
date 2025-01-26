package topicos;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);

        // Displaying the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Accessing elements
        System.out.println("Value for key 'Two': " + linkedHashMap.get("Two"));

        // Iterating over the LinkedHashMap
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Removing an element
        linkedHashMap.remove("Three");
        System.out.println("LinkedHashMap after removal: " + linkedHashMap);
    }
}