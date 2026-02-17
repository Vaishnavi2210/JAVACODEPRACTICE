package _1_coreJava._17_collection_Framework._2_List_Interface._2_LinkedList_Class;

public class Doubly_LinkedList_Implementation {
    // What is LinkedList?
// is a doubly linked list implementation of the List and Deque interfaces.

//👉 Each element is stored as a node
//👉 Each node has:

//  data
//  reference to previous node
//  reference to next node

// 🧠 Internal Structure
//    null <- [prev | data | next] <-> [prev | data | next] <-> [prev | data | next] -> null//   So:
//    Fast insertion / deletion
//    Slow random access (no index-based direct access)

    public static void main(String[] args) {

        class Node{
            Object data;
            Node next;
            Node previous;

            Node(Object data){
                this.data = data;
                this.next = null;
                this.previous = null;
            }
        }

        // Doubly Linked List class
        class LinkedList {
           Node head;  // first
           Node tail;  // last
           int size = 0;

            // Add element
           void add( Object data) {
               Node newNode = new Node(data);

               // check - If list is empty
               if (head == null) {
                   head = newNode;
                   tail = newNode;
               } else {

                   tail.next = newNode;     // forwar link
                   newNode.previous = tail; // backward link
                   tail = newNode;
               }
               size++;
           }
               // Print forward
            void printForward(){
                Node temp = head;
                while (temp != null){
                    System.out.println(temp.data + " <-> ");
                    temp = temp.next;
                }
                System.out.println("null");
           }

           // Print backward
            void  printBackward(){
               Node temp = tail;
               while (temp != null){
                   System.out.println(temp.data + "<->");
                   temp = temp.previous;
               }
                System.out.println("null");
            }

            int size(){
                 return  size;
           }
       }

       //Test
       LinkedList llist = new LinkedList();
        llist.add(100);
        llist.add(200);
        llist.add(300);
        llist.add(400);
          llist.add(500);
        llist.add(200);
        llist.add(400);
        llist.add(800);
        llist.add(300);
        llist.add(700);

        llist.printForward();
        llist.printBackward();
        System.out.println("LinkedList Size : "+ llist.size());
    }
}

/*
 In
Node → represents a single element in a doubly linked list (has data, next, previous).
       data → stores the value of the node (any object, like Integer).
       next → points to the next node.
       previous → points to the previous node.
   Two constructors:
      Node() → default, no data.
      Node(Object object) → sets the data of the node.

LinkedList → represents the doubly linked list itself with head, tail, and size.
             head → points to the first node of the list.
             tail → points to the last node of the list.
             size → keeps track of number of nodes.
 */