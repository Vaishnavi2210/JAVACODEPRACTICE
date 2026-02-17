package _1_coreJava._17_collection_Framework._1_collection_interface;

import java.util.ArrayList;
import java.util.List;

public class _4_Traversal_Methods {
    public static void main(String[] args) {
        /*
         iterator() → sequential access
         toArray() → Object array
         toArray(T[]) → type-safe array
       */

        // 5. Iterator iterator() : Collection ko one-by-one traverse/search karne ke liye - Order maintain hota hai (List me)

        List list4 = new ArrayList();
        list4.add("Jay");
        list4.add("Gayu");
        list4.add(10);
        list4.add(11.11);




        // 6. Object[] toArray() - Collection ko Object array me convert karta hai

        List<String> list3 = new ArrayList<>();
        list3.add("Alice");
        list3.add("B");

        Object[] arr = list3.toArray();
        System.out.println(arr[0]);  //Alice

        // 7. Type-casting required if you want String
        // String s = (String) arr[0];


        //  <T> T[] toArray(T[] a) - Typed array me convert karta hai

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("F");

        String [] array = list1.toArray(new String[0]);

    }
}

// ❓ Why iterator() is preferred over for-loop?
//✅ Prevents ConcurrentModificationException

// ❌ Trap 3: Why new String[0]?
//👉 JVM automatically creates correct-size array


