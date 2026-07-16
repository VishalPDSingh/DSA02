package ch5_Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Demo5Iterate {
    public static void main(String[] args) {

        HashMap<String, Integer> pointtable = new HashMap<>();

        // Insertion
        pointtable.put("CSK", 1);
        pointtable.put("RCB", 2);
        pointtable.put("MI", 3);
        pointtable.put("SRH", 4);
        pointtable.put("RR", 5);

        // --- APPROACH 1: Iterating over Keys Only ---
        System.out.println("--- Teams ---");
        for (String team : pointtable.keySet()) {
            System.out.println("IPL Team: " + team);
        }
        
        System.out.println(); // Blank line for spacing

        // --- APPROACH 2: Iterating over Values Only (Separated!) ---
        System.out.println("--- Ranks ---");
        for (int position : pointtable.values()) {
            System.out.println("Rank: " + position);
        }

        System.out.println(); 

        // --- APPROACH 3: Both at the same time (Best Practice) ---
        System.out.println("--- Standings Table ---");
        for (Map.Entry<String, Integer> entry : pointtable.entrySet()) {
            System.out.println("Team: " + entry.getKey() + " | Rank: " + entry.getValue());
        }
    }
}