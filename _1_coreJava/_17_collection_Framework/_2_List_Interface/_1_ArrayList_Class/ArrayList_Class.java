package _1_coreJava._17_collection_Framework._2_List_Interface._1_ArrayList_Class;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Class {
    //ArrayList implements List + RandomAccess (fast index access)
    /*
     ArrayList inherits methods from Collection and List interfaces
     for insertion, deletion, searching, traversal, and indexing,
     and also provides capacity-management methods like ensureCapacity and trimToSize.
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Vaishnavi");
        list.add("Gayatri");
        list.add("Jay");
        list.add("Swaransh");
        list.add("Kunal");
        list.add("Anushka");
        list.add("Tejas");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Sorted List1 : " + list);

        // 1. void ensureCapacity(int minCapacity) - Increases the internal array capacity
        //                                   Improves performance when you know elements count in advance
        //                                   Avoids frequent resizing
        //                                   Used to optimize performance by allocating memory in advance.

        list.ensureCapacity(100); // prepares space for 100 elements


        // 2. void trimToSize() - Shrinks capacity to current size - Frees unused memory
        //                        - Used to reduce memory overhead.
         ArrayList<Integer> list1 = new  ArrayList<>();
         list1.add(10);
         list1.add(30);
         list1.add(40);
         list1.add(20);
         list.trimToSize(); // removes extra unused capacity

        System.out.println(list1);

        Collections.sort(list1);
        System.out.println("Sorted List1 : " + list1);

        /*
 Important Clarification

❓ “But ArrayList has so many methods na?”

True — but they are INHERITED, not “own”.
❌ These are NOT ArrayList own methods:

Where others come from:  Method	Comes From

add(), remove(), contains(), conytainsAll()  -  Collection interface
get(), set(), indexOf(), listIterator()	     -  List interface
iterator()	                                 -  Iterable interface
toString(), equals(), hashCod                -  Object / AbstractCollection
         */
    }
}
