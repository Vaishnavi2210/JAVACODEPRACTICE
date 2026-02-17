package _1_coreJava._17_collection_Framework._2_List_Interface;

import java.util.ArrayList;
import java.util.List;

public class _4_ListSize_Status {
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

        // int size() -  Return type: int
        //               Description: Returns number of elements in list.
        System.out.println("int size() ");
        System.out.println(list.size());  // 10


        // boolean isEmpty() - Return type: boolean
        //                     Description: Checks if list is empty.
        System.out.println("boolean isEmpty()");
        System.out.println(list.isEmpty());   // false


    }
}
