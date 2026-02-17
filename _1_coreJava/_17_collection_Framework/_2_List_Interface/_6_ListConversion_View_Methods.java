package _1_coreJava._17_collection_Framework._2_List_Interface;

import java.util.ArrayList;
import java.util.List;

public record _6_ListConversion_View_Methods() {
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

        // 1. Object[] toArray() - Return type: Object[]
        //                           Description: Converts list to array of Objects.
        System.out.println("Object[] toArray()");
        Object[] arr = list.toArray();

        System.out.println(arr.toString());

       // 2. <T> T[] toArray(T[] a) - Return type: T[]/
        //                            Description: Converts list to typed array.
        System.out.println("<T> T[] toArray(T[] a)");

        String[] strArray  = list.toArray(new String[0]);
        System.out.println(strArray.toString());


        // 3. List<E> subList(int fromIndex, int toIndex) - Return type: List<E>
        // Description: Returns a view of list between fromIndex (inclusive) and toIndex (exclusive).
        System.out.println("3. List<E> subList(int fromIndex, int toIndex)");

        List<String> sub = list.subList(1,3);
        System.out.println(sub.toString());

        //Start from index 1 ✅   - (1,2) return even write (1,3)
        //Stop before index 3 ❌
    }
}
