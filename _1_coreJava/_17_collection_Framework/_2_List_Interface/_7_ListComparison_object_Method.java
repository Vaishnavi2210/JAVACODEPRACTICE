package _1_coreJava._17_collection_Framework._2_List_Interface;

import java.util.ArrayList;
import java.util.List;

public class _7_ListComparison_object_Method {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Vaishnavi");
        list.add("Gayatri");
        list.add("Jay");
        list.add("Kunal");
        list.add("Swaransh");
        System.out.println(list);

        List<String > list1 = new ArrayList<>();
        list1.add("Tejas");
        list1.add("Anushka");
        list1.add("Swaransh");


        // 1. boolean equals(Object o) - Return type: boolean
        //                               Description: Compares list with another object element-wise.
        //                             Checks: Same size,  Same elements, Same order
        System.out.println("boolean equals(Object o)");
        System.out.println(list.equals(list1));


        // 2. int hashCode() - Return type: int
        //                     Description: Returns hash code of the list
        //                     Checks: returns a hash value based on elements + order
        //                     If equals() is true → hashCode() MUST be same
        System.out.println(" int hashCode()");
        System.out.println(list == list1);
        System.out.println(list.hashCode());
        System.out.println(list1.hashCode());


        // 3. String toString() - Return type: String
        //                        Description: Returns string representation of list.
        //                             Automatically overridden by AbstractCollection
        System.out.println("String toString()");
        System.out.println(list);
        System.out.println(list1);



        List<String> list2 = new ArrayList<>(List.of("A", "B", "C"));
        List<String> list3 = new ArrayList<>(List.of("A", "B", "C"));
        List<String> list4 = new ArrayList<>(List.of("C", "B", "A"));

        System.out.println(list2.equals(list3)); // true
        System.out.println(list2.equals(list4)); // false

    }
}
