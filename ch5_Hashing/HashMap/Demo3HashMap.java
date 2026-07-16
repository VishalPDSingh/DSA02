package ch5_Hashing.HashMap;

import java.util.HashMap;

public class Demo3HashMap {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> map = new HashMap<>();

        // insert
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        System.out.println(map);

        // get
        int poupulation = map.get("US");
        System.out.println(poupulation);

        System.out.println(map.get("Sir")); // null

        // contains key
        System.out.println(map.containsKey("India"));// true
        System.out.println(map.containsKey("pak")); // false

        // remove 
        System.out.println(map.remove("US"));

    }
}
