package _1_coreJava._17_collection_Framework.Map_interface.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo1 {
    //LinkedHashMap key features
    //         * unique keys, homo or hetero keys,  no SO,
    //         * null only once
    //         * insertion order of keys
    public static void main(String[] args) {

        Map map = new LinkedHashMap();
        map.put(1, "abc");
        map.put(1, "abc");
        map.put(null, "abc");
        map.put(null, "abc");
        map.put(null, "abc");
        map.put("abc", "abc");
        map.put("abc", "abc value updated");
        map.put("xyz", "abc");

        System.out.println("LinkedList :  Insertion Order Maintain :");
        System.out.println(map);

    }
}
