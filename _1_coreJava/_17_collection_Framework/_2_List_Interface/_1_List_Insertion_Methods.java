package _1_coreJava._17_collection_Framework._2_List_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_List_Insertion_Methods {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Vaishnavi");
        list.add("Gayatri");
        list.add("Jay");
        list.add("Kunal");
        list.add("Anushka");
        list.add("Tejas");

        //System.out.println(list.toString());

       /* Does ArrayList override toString()? Yes ✅
              ArrayList extends AbstractList, which overrides toString()
              That’s why printing an ArrayList shows elements in [ ] brackets, not hashcode
       */

        // 1. boolean add(E e) -  Adds element at the end of the list. Returns true if the list changed.
           list.add("Kartik");  // true
           System.out.println("add() : " + list);

        // 2.void add(int index, E element) - Inserts element at specific index. Shifts subsequent elements to the right.
            list.add(4,"Vaishnavi");
            list.add(5, "Samprada");
           System.out.println("add(i, e) : "+ list);

        // 3. boolean addAll(Collection<? extends E> c) - Adds all elements from another collection at the end.
          list.addAll(Arrays.asList("Bhushan", "Sanskruti"));
         System.out.println("add(collection) : " + list);

        // 4. boolean addAll(int index, Collection<? extends E> c) - Inserts all elements from another collection at specific index.
        list.addAll(5, Arrays.asList("Trupti", "Swaransh"));
        System.out.println("add(i, collection : "+ list);


    }
}
