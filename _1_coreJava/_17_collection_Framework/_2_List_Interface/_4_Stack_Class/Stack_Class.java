package _1_coreJava._17_collection_Framework._2_List_Interface._4_Stack_Class;

import java.util.Stack;

public class Stack_Class {
    /*
           Stack is a LIFO data structure
           👉 Last In, First Out
           Present in java.util
           Stack is a class
           Extends Vector <- why legacy ?
          All methods are synchronized → slow
          Java recommends using Deque instead

           public class Stack<E> extends Vector<E>

          push(10) → [10]
          push(20) → [10, 20]
          push(30) → [10, 20, 30]
          pop()    → [10, 20]


     */
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();

        // push(E item) - nserts element at top of stack
        stack.push(10);   // Calls addElement() of Vector, Element added at end
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("stack : " + stack);
        // pop() - Removes & returns top element
        System.out.println("delete : " + stack.pop());   // Finds last element, Removes it, Reduces size

        // peek() - Returns top element without removing
        System.out.println(" top element :" + stack.peek());

        // empty() - Checks if stack is empty, Returns true / false
        System.out.println("Search empty :" + stack.empty());

        // Search(Object o) - Returns 1-based position from top
        System.out.println(stack.search("Search 40 : " + 40));  // Returns -1 if not found

/*
      Inherited Methods from Vector

Since Stack extends Vector, it also has:

    add()
    remove()
    get()
    size()
    capacity()
    iterator()

⚠ Bad practice to use these on Stack
 */


    }
}