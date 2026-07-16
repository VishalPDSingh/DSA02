package ch5_Hashing.HashMap;

import java.util.HashMap;

public class Demo4HashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> pointtable = new HashMap<>();

        // Insertion
        pointtable.put("CSK", 1);
        pointtable.put("RCB", 2);
        pointtable.put("MI", 3);
        pointtable.put("SRH", 4);
        pointtable.put("RR", 5);

   //     System.out.println(pointtable);

        // iterate on hash map
        for(String map:pointtable.keySet())
        {
            System.out.println(map);
        }
    }
}
