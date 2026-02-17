package _1_coreJava._17_collection_Framework.Map_interface.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Class {

        public static void main(String[] args) {

            Map<Integer, String> map = new HashMap<>();

            // 1️⃣ Add key-value pairs
            map.put(1, "Vaishnavi");
            map.put(2, "Gayatri");
            map.put(3, "Jay");
            map.put(4, "Anushka");
            map.put(null, "NullKey"); // allowed
           // map.put(null, "Do");
            map.put(5, null); // allowed

            System.out.println("HashMap: " + map);

            // 2️⃣ Get value by key
            System.out.println("Value for key 3: " + map.get(3));

            // 3️⃣ Remove a key
            map.remove(2);
            System.out.println("After removing key 2: " + map);

            // 4️⃣ Check existence
            System.out.println("Contains key 1? " + map.containsKey(1));
            System.out.println("Contains value 'Jay'? " + map.containsValue("Jay"));

            // 5️⃣ Iterating over entries
            System.out.println("Iterating over HashMap:");
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

}

/*
  3️⃣ Sample Output
    HashMap: {1=Vaishnavi, 2=Gayatri, 3=Jay, 4=Anushka, null=NullKey, 5=null}
    Value for key 3: Jay
    After removing key 2: {1=Vaishnavi, 3=Jay, 4=Anushka, null=NullKey, 5=null}
    Contains key 1? true
    Contains value 'Jay'? true
    Iterating over HashMap:
            1 -> Vaishnavi
3 -> Jay
4 -> Anushka
null -> NullKey
5 -> null
 */

