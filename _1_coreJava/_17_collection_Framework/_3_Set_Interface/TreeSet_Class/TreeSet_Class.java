package _1_coreJava._17_collection_Framework._3_Set_Interface.TreeSet_Class;

import java.util.*;

public class TreeSet_Class {

    /*
       What is TreeSet?
          Part of java.util
          Implements NavigableSet
          Sorted Set
          No duplicates
          Does NOT allow null
          Backed by Red-Black Tree

Set<Integer> set = new TreeSet<>();

Internal Working of TreeSet (VERY IMPORTANT)

Uses Red-Black Tree
Elements stored in sorted order

Comparison using:
Comparable OR
Comparator

compare(a, b)
If result = 0 → duplicate (not added)

Step-by-step:
Tree is empty → element becomes root
Compare new element with current node
Smaller → left subtree
Greater → right subtree
Tree balances itself (Red-Black rules)
     */
    public static void main(String[] args) {


        Set<Integer> treeSet = new TreeSet<>();

        // add(E e)
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(50);
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        //  addAll(Collection c) - Adds elements one by one, Maintains sorted order
        treeSet.addAll(list);
        System.out.println(treeSet);

        // remove() - Find element via comparison, Removes node, Tree rebalences
        treeSet.remove(1);

        TreeSet<Integer> tSet = new TreeSet<>();

        // pollFirst() -  Removes smallest element
        tSet.pollFirst();

        // pollLast() -  Removes largest element
        tSet.pollLast();

        // clear()
        tSet.clear();

        for (Integer i : tSet) {
            System.out.println(i);
        }

        // Iterator
        Iterator<Integer> it = tSet.iterator();

        //Descending order
        Iterator<Integer> itt = tSet.descendingIterator();

        // SEARCH / NAVIGATION METHODS (TreeSet SPECIAL)

        // first() - Smallest element
        tSet.first();

        // last() - Largest element
        tSet.last();

        // higher(E e ) -  Smallest element greater than e
        tSet.higher(20);

        // lower(E e) -     Greatest element less than e
        tSet.lower(20);

        //🔹 ceiling(E e)
        tSet.ceiling(20);
        //≥ element

        //🔹 floor(E e)
        tSet.floor(20);
        //≤ element

        //5️⃣ RANGE VIEW METHODS
        //🔸 subSet(from, to)
        //set.subSet(20, 50);

        //from inclusive, to exclusive
        //🔸 headSet(to)
        tSet.headSet(30);
        //Elements < 30

        //🔸 tailSet(from)
        tSet.tailSet(30);

        //Elements ≥ 30
    }
}

    //9️⃣ TreeSet vs HashSet vs LinkedHashSet
    //Feature	HashSet   	LinkedHashSet	 TreeSet
    //Order	      ❌         Insertion       Sorted
    //Speed	     Fast          Medium	      Slow
    //Null	       1	         1	           ❌
    //Sorting     No             No            }Yes

    //✔ TreeSet stores sorted data
    //✔ Uses Red-Black Tree
    //✔ No null allowed
    //✔ O(log n) operations
    //✔ Duplicate decided by compareTo/compare

    //❗ Common Interview Questions
    //❓ Why TreeSet doesn’t allow null?
    //→ Comparison needed → NPE
    //
    //❓ How TreeSet avoids duplicates?
    //→ compareTo() returning 0
