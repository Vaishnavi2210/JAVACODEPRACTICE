package _1_coreJava._17_collection_Framework._3_Set_Interface.LinkedHashSet_Class;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Class {
    public static void main(String[] args) {
          /*
             features of linkedHashSet
        * 1. multiple values same type or diff type
        * 2. unique
        * 3. only one null value
        * 4. insertion order of elements will be maintained
        * */

        Set set = new LinkedHashSet();

        set.add(100);
        set.add(100);
        set.add("abc");
        set.add("abc");
        set.add(12.5f);
        set.add(true);
        set.add(false);
        set.add(null);
        set.add(null);
        set.add(null);

        System.out.println(set.toString());

        //[100, abc, 12.5, true, false, null]

       //  seen tracks all characters we saw
        // repeated tracks characters that repeated in order
        // iterator().next() → first repeated character

    }
}
