package _1_coreJava._17_collection_Framework.Map_interface.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Demo1 {
    // TreeMap key features
    //         * unique keys, homo keys,   Sorting order
    //         * null not even once
    //         * no insertion order of keys
    public static void main(String[] args) {
        Map map = new TreeMap<>();

        // map.put(1, "abc");
       //  map.put(1, "abc");
           map.put("pqr", "abc");
        // map.put(null, "abc");
        // map.put(null, "abc");
        // map.put(null, "abc");
           map.put("abc", "abc");
           map.put("abc", "abc value updated");
           map.put("xyz", "abc");

        System.out.println("TreeSet : sorted in natural(here Alphabetical) Order ");
        System.out.println(map);
    }
}
