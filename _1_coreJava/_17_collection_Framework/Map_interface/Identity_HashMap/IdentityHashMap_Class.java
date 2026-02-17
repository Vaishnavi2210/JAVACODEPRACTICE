package _1_coreJava._17_collection_Framework.Map_interface.Identity_HashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMap_Class {
    // == (memory address comparison)
    // Even if objects are equal in value → treated as different keys if memory reference differs
    public static void main(String[] args) {

                String s1 = new String("Java");
                String s2 = new String("Java");

                Map<String, Integer> hashMap = new HashMap<>();
                hashMap.put(s1, 1);
                hashMap.put(s2, 2);

                System.out.println("HashMap size: " + hashMap.size());

                Map<String, Integer> identityMap = new IdentityHashMap<>();
                identityMap.put(s1, 1);
                identityMap.put(s2, 2);

                System.out.println("IdentityHashMap size: " + identityMap.size());

                /*
Output
HashMap size: 1
IdentityHashMap size: 2

5️⃣ Why?
Even though:
s1.equals(s2) → true

But:
s1 == s2 → false
Because they are two different objects in memory.

So:
HashMap → treats them same (equals)
IdentityHashMap → treats them different (==)
                 */

    }
}
