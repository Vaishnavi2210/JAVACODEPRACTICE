package _1_coreJava._17_collection_Framework._2_List_Interface._3_Vector_Class;

import java.util.Vector;

public class Vector_Class_Methods {
    // Vector is a legacy, synchronized, dynamic array class in Java.
     /*
        Vector is a legacy synchronized dynamic array, ❌ Slower than ArrayList
        that supports Enumeration and provides thread-safe operations at the cost of performance.

      public class Vector<E>
      extends AbstractList<E>
      implements List<E>, RandomAccess, Cloneable, Serializable

      Cursors in Vector
        Cursor	    Supported
       Iterator	     ✅ Yes   (Forward Traversal)
   ListIterator	     ✅ Yes   (BackWard Traversel)
    Enumeration	     ✅ Yes (legacy)  (Forward traversal)
*/
    Vector<String> v = new Vector<>();
        //  v.addElement("Java");
        //  v.addElement("Spring");
        //  System.out.println(v); // [Java, Spring]
                                              //E here = String

    // 1. Capacity Related
        // 1.1 int capacity() - Returns how many elements Vector can hold without resizing.

        // 1.2 void ensureCapacity(int minCapacity) - Increases capacity in advance.

        // 1.3 void trimToSize() - Removes unused capacity.

        // 1.4 void setSize(int newSize) - Changes the size of Vector.
        //                                 If increased → fills with null
        //                                 If decreased → removes elements
        //                                 ⚠ Dangerous if misused

    // 2. Legacy Add / Remove
     //  2.1 void addElement(E obj) - Adds element at end.

     // 2.2 boolean removeElement(Object obj) - Removes first occurrence().

     // 2.3 void removeAllElements() - Clears vector(Same as clear()).

    // 3. Access Methods
    // 3.1 E elementAt(int index) - Returns element at index.Same as get()

    // 3.2 E firstElement() - Returns first element.

    // 3.3 E lastElement() - Returns last element.


    // 4. Search Methods

    // 4.1 boolean contains(Object o) - Checks presence.
         //    v.contains("A");


    // 4.2 int indexOf(Object o) - Returns first index.

    // 4.3 int lastIndexOf(Object o) - Returns last index (for duplicates).



    // 5. Enumeration (🔥 Legacy Cursor)

    /* What is Enumeration?
       A legacy cursor used to traverse Vector.

    Enumeration<String> e = v.elements();
    while(e.hasMoreElements()) {
        System.out.println(e.nextElement());
    }
    */
}
