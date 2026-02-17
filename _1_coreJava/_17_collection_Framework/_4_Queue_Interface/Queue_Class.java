package _1_coreJava._17_collection_Framework._4_Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Class {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Add elements
        queue.add(10);       // throws exception if fails
        queue.offer(20);  // return false if fails

        System.out.println(queue);  // [10, 20]

        // peek and poll
        System.out.println(queue.remove());   // 10 (remove tail)
        System.out.println(queue.poll());     // 20 (removes head)
       // System.out.println(queue.element());  // NoSuchElementException


       // System.out.println(queue.remove());    // NoSuchElementException
        System.out.println(queue.poll());      // null
        System.out.println(queue.peek());      // null



    }

}
