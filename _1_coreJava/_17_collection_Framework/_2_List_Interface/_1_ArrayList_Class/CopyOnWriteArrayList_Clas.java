package _1_coreJava._17_collection_Framework._2_List_Interface._1_ArrayList_Class;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_Clas {
    // It is a CLASS, 👉 It is present in java.util.concurrent package
    // It is a special ArrayList where
    //  you CAN add/remove elements while looping
    //  and no error comes.
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//
//        Iterator it = list.iterator();
//
//        while(it.hasNext()){
//            System.out.print(it.next());
//            list.add(60);   // ConcurrentModificationException
//        }                   // ❌ You CANNOT modify an ArrayList while iterating using Iterator


        CopyOnWriteArrayList<Integer> copylist = new CopyOnWriteArrayList<>();
        copylist.add(60);
        copylist.add(70);
        copylist.add(80);
        copylist.add(80);
        copylist.add(90);
        copylist.add(100);

        Iterator itt =  copylist.iterator();

        while(itt.hasNext()){
            System.out.println(itt.next());
            copylist.add(200);
        }
    }
}

// CopyOnWriteArrayList is a thread-safe List CLASS that allows modification during iteration without error.

/*
Step-by-step execution
Step	    Iterator sees	          Actual list after add
 1	             60	                  [60,70,80,90,100,200]
 2	             70              	[60,70,80,90,100,200,200]
 3	             80	               [60,70,80,90,100,200,200,200]
 4	             90	                    continues growing
 5	             100	                continues growing

🔑 Iterator prints only original elements















 */