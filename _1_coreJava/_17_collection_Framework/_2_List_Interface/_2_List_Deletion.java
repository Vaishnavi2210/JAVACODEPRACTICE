package _1_coreJava._17_collection_Framework._2_List_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class _2_List_Deletion {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Vaishnavi");
        list.add("Gayatri");
        list.add("Jay");
        list.add("Swaransh");
        list.add("Kunal");
        list.add("Anushka");
        list.add("Tejas");
        list.add("Kartik");
        list.add("Divyakshi");
        list.add("Swaransh");
        System.out.println(list);

        // remove(int) → index
        // remove(Object) → element

        // 1. boolean remove(Object o) - Removes the first occurrence of the specified element.
                                        // Returns true if element was found and removed, false otherwise
               list.remove("Divyakshi");
               System.out.println("remove(Divyakshi) : " + list);


        // 2. E remove(int index) - Removes the element at the specified index.
        //                          Returns the removed element.
              list.remove(4);
              System.out.println("remover(3) : " + list);


        // 3. boolean removeAll(Collection<?> c) - Removes all elements present in the specified collection.
        //                                         Returns true if the list changed.
              list.removeAll(Arrays.asList("Kartik", "Trupti"));
              System.out.println("removeAll(Kartik, Trupti) : " + list);


        // 4. boolean retainAll(Collection<?> c) - Keeps only elements present in the specified collection.
        //                                         Removes all other elements. Returns true if the list changed.
               list.retainAll(Arrays.asList("Vaishnavi", "Gayatri", "Jay", "Kunal"));
                System.out.println("ReatailAll () : " + list);

        // 5. default boolean removeIf(Predicate<? super E> filter) - Removes elements matching a condition (predicate).
        //                                                       Returns true if any elements were removed.
              list.removeIf(name -> name.startsWith("K"));
              System.out.println(" RemoveIf  name starts with K :" + list);

        // 6. void clear() - Removes all elements from the list. No return value.
               list.clear();
               System.out.println("List Clear : " + list);
    }
}
