package _1_coreJava._17_collection_Framework._2_List_Interface._3_Vector_Class;

import java.util.*;

public class Vector_Class {
    /*
         Vector is a legacy class
         Part of java.util
         Implements List
         Internally uses a dynamic array
         Thread-safe (synchronized) used in Multi-threaded environment

* Internal Working of Vector
  ->  Stores elements in an Object[] array
      Has capacity
      When full → creates new array with larger size

   newCapacity = oldCapacity * 2
   Initial capacity = 10
   Capacity increases automatically

   */
    public static void main(String[] args) {

    // -------------- List attributes ----------------
        System.out.println(" --------- List attributes ---------");
        List<Integer> list1 = new Vector<>();

        list1.add(100);  // Adds element at end of list, Checks capacity, If full → resize, Stores element at next index
        list1.add(200);
        System.out.println("List1 : "+ list1);
        list1.add(1, 300);  //Inserts element at given index, Shifts elements right, Inserts new element

        List<Integer> list2 = new Vector<>(Arrays.asList(10, 20, 30));

        System.out.println("List1 with list2 elements :" + list1.addAll(list2));    // Adds all elements of another collection
        System.out.println(list1);

        list1.addAll(2, list2);  // Shifts elements, insert Collection
        System.out.println(list1);
        System.out.println(list1.set(2, 900)); // replace 10 with 900 of index 2
        System.out.println(list1);

        System.out.println("first Element :"+ list1.get(0));  // Returns element at index
        System.out.println("Remove 5th index element: "+ list1.remove(5));  // Removes element at index

        System.out.println("Remove integer value of 10 : " +list1.remove(Integer.valueOf(10)));  // Traverses list, uses equals(), Removes first match
        System.out.println("Contains 10 : " + list1.contains(10));   // Linear search using equals()
        System.out.println("Index of 20(check first by deafult) : " + list1.indexOf(20));    // Returns first index of element, -1 if not found
        System.out.println("LastIndex of 20 : "+list1.lastIndexOf(20)); // Searches from end
        System.out.println("Size of List : " + list1.size());  // Returns element count
        System.out.println("Check Empty ? " + list1.isEmpty());  // Checks if size == 0

        Object[] arr = list1.toArray();   // Converts list → array
        list1.subList(4, 7);          //Returns view, not new list

        Iterator it = list1.iterator();  // used for traversal , fail - fast
        ListIterator itt = list1.listIterator();  // ✔ Forward + backward traversal , Can modify list
        System.out.println(list1);

        list1.clear(); // clear list
        System.out.println("List clear : " +list1);

       // ------------- Vector-Specific (OWN / Legacy) Methods  ------------
        System.out.println("Vector-Specific (OWN / Legacy) Methods");
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        //addElement(E e) - legacy method same as add()
        v.addElement(50);

        // elementAt(int index) - Same as get()
        System.out.println("element at index 2 : "+ v.elementAt(2));

       // firstElement() - Returns first element
        System.out.println("firstElement() : " + v.firstElement());  //Returns first element

        // lastElement()
        System.out.println("lastElement() : " + v.lastElement());  // Returns last element

        // removeElement(Object o)
        System.out.println("removeElement() : "+ v.removeElement(10));  // Removes first occurrence, returns boolean


        // removeAllElements() - Same as clear()
          v.removeAllElements();
        System.out.println(v);

        System.out.println("Size: "+ v.size());    // Returns internal array size
        System.out.println("Capacity: "+ v.capacity());   // Initial Capacity 10

        // ensureCapacity(int minCapacity) - Pre-allocates memory
        v.ensureCapacity(50);

        // trimToSize() - Shrinks capacity to size
        v.trimToSize();

        // elements() (Enumeration) - ✔ Legacy iterator, ❌ Not fail-fast


        // -- Thread Safety (VERY IMPORTANT)

        // synchronized  - ✔ Thread-safe, ❌ Slow performance

    /*
           Ways to use synchronized in Java

There are 4 main ways:
          Synchronized method
          Synchronized block
          Static synchronized method
          Using synchronized collections

       // Vector (default synchronized)
   Better than Vector ?
    ->  List list = Collections.synchronizedList(new ArrayList());

   Does synchronized guarantee order?
   -> ❌ No, only mutual exclusion

     */

      }
}