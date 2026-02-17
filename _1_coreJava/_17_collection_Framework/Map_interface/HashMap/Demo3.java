package _1_coreJava._17_collection_Framework.Map_interface.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ashutosh");
        map.put(3, "chetan");
        map.put(2, "gayatri");
        map.put(4, "kamlini");
        map.put(5, "rushi");

        System.out.println("Only key");
        Set<Integer> onlyKeys = map.keySet();
        System.out.println(onlyKeys);

        System.out.println("Only Values");
        Collection<String> values = map.values();
        System.out.println(values);

        System.out.println("all entries");
        Set<Map.Entry<Integer, String>>  entries = map.entrySet();
        System.out.println(entries);

        System.out.println("Using for loop");
        for (Map.Entry<Integer, String> entry : entries){
            System.out.println(entry);

            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

    }
}
