package _1_coreJava._17_collection_Framework._2_List_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3_ListSearch {
    public static void main(String[] args) {

        // 1. E get(int index) - Return Type: E (element type of the list)
        //                       Description: Returns the element at the specified index.
              System.out.println(" E get(int index)");
        List<String>  list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Orange"));
               String element = list1.get(3);     //  Orange
               System.out.println("Element at index 3 : " + element);


        // 2. E set(int index, String element) - Return Type: E
        //         Description: Replaces the element at the specified index. Returns the previous element.
        System.out.println(" E set(int index, String element)");
        List<String>  list2 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Orange"));
                 String old = list2.set(0, "Grapes");     // [Grapes, Banana, Mango, Orange]
                 System.out.println("Replaced element: "  + old);


         // 3. boolean contains(Object o) - Return Type: boolean
         //                                Description: Checks if the list contains the specified element.
        System.out.println(" boolean contains(Object o)");
                 System.out.println(list2.contains("Apple"));      // false
                 System.out.println(list2.contains("Mango"));      // true

        // 4. boolean containsAll(Collection<?> c) - Return Type: boolean
        //                    Description: Checks if the list contains all elements of another collection.
                 System.out.println("boolean containsAll(Collection<?> c)");
                 System.out.println(list2.containsAll(Arrays.asList("Banana", "Orange")));  // true
                 System.out.println(list2.containsAll(Arrays.asList("Banana", "Papaya")));  // false

       /*
         Difference from indexOf():
                           indexOf() → first occurrence (lowest index)
                       lastIndexOf() → last occurrence (highest index)
        */
        // 5. int indexOf(Object o) - Return Type: int
        //     Description: Returns the first index of the element, or -1 if not found.

        System.out.println("int indexOf(Object o)");
        System.out.println(list2.indexOf("Mango"));   //  2
        System.out.println(list2.indexOf("Apple"));   // -1
        System.out.println(list2);

        // 6. int lastIndexOf(Object o) - Return Type: int
        //                     Description: Returns the last index of the element, or -1 if not found.
                                 // Works well with duplicates. give last index of duplicate element
        System.out.println("int lastIndexOf(Object o) ");

        List<String> list3 = new ArrayList<>(Arrays.asList("Grapes", "Banana", "Mango", "Orange"));
        //  lastIndexOf before adding
        System.out.println(list3.lastIndexOf("Banana"));  // 1 (1st occurs)

        System.out.println(list3.add("Banana"));     // true
        // lastIndexOf after adding
        System.out.println(list3.lastIndexOf("Banana"));  // 4 (last occurs)

        System.out.println(list3.lastIndexOf("Apple"));   // -1 (not occurs)


        //












    }
}
