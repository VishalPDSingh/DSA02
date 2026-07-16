package ch5_Hashing.HashMap;

import java.util.HashMap;

public class Demo2HashMap {
    public static void main(String[] args) {

        // Create the map
        HashMap<String, Integer> scores = new HashMap<>();
        // 1. INSERTING DATA (.put)
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);
        System.out.println("Initial Map: " + scores);

        // 2. UPDATING DATA (Also uses .put)
        // Since "Bob" already exists, this overwrites 85 with 92
        scores.put("Bob", 92);
        System.out.println("After updating Bob: " + scores);

        // 3. INSERT IF ABSENT (.putIfAbsent)
        // Alice won't change because she's already there. David will be added.
        scores.putIfAbsent("Alice", 100);
        scores.putIfAbsent("David", 88);
        System.out.println("After conditional inserts: " + scores);

        // 4. READING DATA (.get)
        Integer aliceScore = scores.get("Alice");
        Integer elonScore = scores.get("Elon"); // Doesn't exist
        System.out.println("Alice's score: " + aliceScore);
        System.out.println("Elon's score: " + elonScore); // Prints null

        // 5. SAFE READING (.getOrDefault)
        // Great for avoiding NullPointerExceptions
        int finalScore = scores.getOrDefault("Elon", 0);
        System.out.println("Elon's fallback score: " + finalScore); // Prints 0

        // 6. CHECKING EXISTENCE (.containsKey)
        if (scores.containsKey("Charlie")) {
            System.out.println("Charlie is in the system.");
        }

        // 7. DELETING DATA (.remove)
        scores.remove("Bob");
        System.out.println("After removing Bob: " + scores);

        // 8. SIZE OF THE MAP (.size)
        System.out.println("Total students tracked: " + scores.size());
    }
}
