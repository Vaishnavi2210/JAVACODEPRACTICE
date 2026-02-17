package _1_coreJava._17_collection_Framework._3_Set_Interface.HashSet_Class;

import java.util.*;

public class HashSet_Class {
    /*
           ✔  HashSet uses HashMap
           ✔  Stores elements as keys
           ✔  Uses hashCode + equals
           ✔  Allows one null
           ✔  Not synchronized
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(12, 15, 17, 19));
        Set<Integer> hashSet = new HashSet<>();

        // add(E e) - Adds if unique, ✔ Returns true / false
        hashSet.add(10);

        // addAll(Collection c) - Adds only unique elements
        hashSet.addAll(list);

        // remove(Object o) - Removes element if exists
        hashSet.remove(12);

        // removeAll(Collection c)
        hashSet.removeAll(list);

        // retainAll(Collection c)
        hashSet.retainAll(list);

        // clear()
        hashSet.clear();

        // Iterator
        Iterator<Integer> it = hashSet.iterator();
        while ((it.hasNext())){
            System.out.println(it.next());
        }

        // Enhanced for-loop
        for(Integer i : hashSet){
            System.out.println(i);
        }

        //Java 8 forEach
        hashSet.forEach(System.out::println);

/*
   ❓ How HashSet avoids duplicates?
    → Using hashCode() & equals()

   ❓ Why HashSet is faster than TreeSet?
    → No sorting

 */
    }
}
