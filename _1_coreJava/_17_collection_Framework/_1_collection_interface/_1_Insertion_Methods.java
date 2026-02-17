package _1_coreJava._17_collection_Framework._1_collection_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class _1_Insertion_Methods {
    public static void main(String[] args) {
        Iterable<String> list1 = new ArrayList<>();  // ye bhi kr skte but iske pas ek hi method hai or wo bhi abstract only iterator()


        //boolean add(E e) - Single element add karta hai
        Collection<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        System.out.println(list); // [Apple, Banana]


        //boolean addAll(Collection c) - Ek saath multiple elements add karta hai
        Collection<String> list2 = new ArrayList<>();
        Collection<String> newList = Arrays.asList("Orange", "Mango");
        list2.addAll(newList);
        System.out.println(list2); // [Apple, Banana, Orange, Mango]
    }
}
