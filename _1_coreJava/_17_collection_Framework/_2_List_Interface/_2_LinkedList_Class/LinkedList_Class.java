package _1_coreJava._17_collection_Framework._2_List_Interface._2_LinkedList_Class;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Class {
    public static void main(String[] args) {
        // LinkedList implements List, Deque, Queue interfaces.
 // Java LinkedList implements List and Deque interfaces, hence it supports index-based operations, queue operations, and double-ended queue operations.
/*
      LinkedList is implemented as a doubly linked list
      It implements List, Queue, and Deque
      Allows duplicate elements
      Allows null values
      Insertion & deletion at ends are O(1)
 */
// ---------------- LIST METHODS ----------------

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(1, 15);
        list.add(4, 25);    // add at index

        System.out.println("List: " + list);
        System.out.println("Get index 2: "+ list.get(2));
        System.out.println("Contains 20: "+ list.contains(20));
        System.out.println("Size: "+ list.size());
        System.out.println("remove index 1: "+ list.remove(1));

        // ---------- QUEUE behavior ----------
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(100);   //insert
        queue.offer(200);
        queue.offer(300);

        System.out.println("\n Queuepoll: "+ queue.poll()); // Removes element from head, Returns removed value, Returns null if empty
        System.out.println("Queue peek: "+ queue.peek());   //(View) Returns first element, Does NOT remove it, Returns null if empty
        System.out.println("Queue:" + queue);

        // ---------- QUEUE behavior ----------
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);    // New node becomes head
        deque.addFirst(2);    // Old head becomes second node
        deque.addFirst(3);
        deque.addLast(5);    //New node becomes tail
        deque.push(0);       //stack push - Internally calls addFirst()

        System.out.println("\nDeque: "+ deque);
        System.out.println("Remove First: "+ deque.removeFirst());   // Removes head node
        System.out.println("Remove Last: "+ deque.removeLast());     //Removes tail node
        System.out.println("Pop: "+ deque.pop());        // Internally calls removeFirst(), Removes top element

        // ---------- Traversal ----------
        System.out.println("\nForward Traversal:");
        for (Integer i : list){         // Starts from head
                                        //Moves using next reference
            System.out.println(i + " ");
        }

        System.out.println("\nBackward Traversal:");
        for (var it = list.descendingIterator(); it.hasNext();){    // Starts from tail
            System.out.print(it.next() + " ");                  // Moves backward using prev
        }
    }
}
