package _1_coreJava._17_collection_Framework._1_collection_interface;

import java.util.*;

public class _3_Search_Methods {

    public static void main(String[] args) {

        Collection list = new ArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // 1. boolean contains(Object o) - Checks whether a single element exists in the collection.
        boolean contain = list.contains("Apple");
        boolean contains = list.contains("Orange");
        System.out.println("contain Apple ? : " + contain);
        System.out.println("contain Orange ? : " + contains);

        // boolean containsAll(Collection<?> c) - Checks whether all elements of another collection exist in this collection.
        boolean containAll = list.containsAll(Arrays.asList("Apple", "Orange"));
        boolean containsAll = list.containsAll(Arrays.asList("Apple", "Mango"));
        System.out.println("containsAll Apple, Orange ? : " + containAll);
        System.out.println("containsAll Apple, Mango ? : " + containsAll);


        // 3. int size() - Returns the number of elements in the collection.
        int size = list.size();
        System.out.println("List Size :" + size);

        // 4. boolean isEmpty() - Checks whether the collection has no elements.
        boolean empty = list.isEmpty();
        System.out.println("List empty ? " + empty);
    }
}