package _1_coreJava._17_collection_Framework._1_collection_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class _2_Deletions_Methods {

    public static void main(String[] args) {

        Collection list = new ArrayList<>();

        list.add("Apple");
        list.add(10);
        list.add('C');
        list.add(1.1);
        list.add(22);
        list.add("Mango");
        list.add("Orange");

        System.out.println(list);

        //1. boolean remove(Object o) - Single element remove karta hai.  Returns: true if element found & removed (boolean return type method)
        Collection<String> list4 = new ArrayList<>();
        list4.add("Apple");
        list4.add("Banana");

        list4.remove("Apple");
        System.out.println(list); // [Banana]

        //2. boolean removeAll(Collection c) - Jo elements given collection me honge, sab remove kar deta hai - multiple delete
        Collection<String> list3 = new ArrayList<>(Arrays.asList("A","B","C","D"));
        Collection<String> removeList = Arrays.asList("B","D");

        list3.removeAll(removeList);
        System.out.println(list3);


        //3.  boolean removeIf(Predicate p) (Java 8+) - Condition ke basis pe remove karta hai, Lambda use hota hai
                Collection<Integer> list2 = new ArrayList<>(Arrays.asList(10, 15, 20, 25));

                    list2.removeIf(n -> n > 18);
                    System.out.println(list2); // [10, 15]

        //4. boolean retainAll(Collection c) - Sirf common elements ko rakhta hai, baaki delete, Opposite of removeAll
        Collection<String> list1 = new ArrayList<>(Arrays.asList("A","B","C"));
        Collection<String> retainList = Arrays.asList("B","C");

        list1.retainAll(retainList);
        System.out.println(list1);


        //5. void clear() - Sab kuch delete kar deta hai
         list.clear();
        System.out.println(list);
    }
}
