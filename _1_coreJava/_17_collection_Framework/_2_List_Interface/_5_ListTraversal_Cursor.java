package _1_coreJava._17_collection_Framework._2_List_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class _5_ListTraversal_Cursor {

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

        // 1. Iterator<E> iterator() - Return type: Iterator<E>
        //                             Description: Provides forward traversal of list.
        System.out.println(" Iterator<E> iterator()");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        // 2. ListIterator<E> listIterator() - Return type: ListIterator<E>
        //                                    Description: Forward + backward traversal.

        System.out.println("ListIterator<E> listIterator()");
        ListIterator lit = list.listIterator();

        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }


        // 3. ListIterator<E> listIterator(int index) - Return type: ListIterator<E>
        //                                              Description: Traversal starting from given index.
        System.out.println("ListIterator<E> listIterator(int index)");

        ListIterator<String> listIterator = list.listIterator(2);

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }




    }
}
