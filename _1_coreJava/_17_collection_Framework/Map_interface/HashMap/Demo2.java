package _1_coreJava._17_collection_Framework.Map_interface.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ashutosh");
        map.put(3, "Chetan");
        map.put(2, "Gayatri");
        map.put(4, "Kamlini");
        map.put(5, "Rushi");

        System.out.println(map);

        //removal
        map.remove(1);
        System.out.println(map);

        map.clear();
        System.out.println(map);
    }
}
