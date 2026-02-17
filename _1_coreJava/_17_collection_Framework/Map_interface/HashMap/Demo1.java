package _1_coreJava._17_collection_Framework.Map_interface.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    //   HashMap key features
    //         * unique keys, homo or hetero keys, no IO, no SO,
    //         * null only once
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1, "abc");
        map.put(2, "abc");
        map.put(1, "abc");
        map.put(null, "abc");
        map.put(null, "abc");
        map.put(null, "abc");
        map.put("abc", "abc");
        map.put("abc", "abc value updated");
        map.put("xyz", "abc");

        System.out.println(map);
    }
}
