package _1_coreJava._17_collection_Framework.Map_interface.WeakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMap_Class {
    // WeakHashMap is a special implementation of the Map interface in Java where keys are stored as weak references.

        public static void main(String[] args) {

            Map<String, String> map = new WeakHashMap<>();

            String key1 = new String("A");
            String key2 = new String("B");

            map.put(key1, "Apple");
            map.put(key2, "Ball");

            System.out.println("Before GC: " + map);

            key1 = null;  // Remove strong reference

            System.gc();  // Suggest GC    // unsure

            // Since garbage collection is not guaranteed to execute immediately after calling System.gc(),
            // Thread.sleep() is sometimes used to give GC time to run before checking the WeakHashMap contents.
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}

            System.out.println("After GC: " + map);
        }
    }

    // Possible Output
    // Before GC: {A=Apple, B=Ball}
    // After GC:  {B=Ball}

    // Entry with key "A" is removed because no strong reference exists.