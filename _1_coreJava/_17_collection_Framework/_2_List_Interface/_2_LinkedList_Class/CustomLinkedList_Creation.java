package _1_coreJava._17_collection_Framework._2_List_Interface._2_LinkedList_Class;

public class CustomLinkedList_Creation {
//LinkedList<E>
// ├── List<E>
// ├── Deque<E>
// ├── Queue<E>
// └── Serializable, Cloneable

        public static void main(String[] args) {

            // Node class
            class Node {
                Object data;
                Node next;


                Node(Object data) {
                    this.data = data;
                    this.next = null;
                }
            }

            // Doubly Linked List class
            class LinkedList {
                Node head;   // first node
                Node tail;   // last node
                int size = 0;

                // Add element
                void add(Object data) {
                    Node newNode = new Node(data);

                    // If list is empty
                    if (head == null) {
                        head = newNode;
                        tail = newNode;
                    } else {
                        tail.next = newNode;      // link new node
                        tail = newNode;           // update tail
                    }
                    size++;
                }

                // Print linked list
                void print() {
                    Node temp = head;
                    while (temp != null) {
                        System.out.print(temp.data + " -> ");
                        temp = temp.next;
                    }
                    System.out.println("null");
                }

                //  Return size
                int size() {
                    return size;
                }
            }

            // Test
            LinkedList list = new LinkedList();
            list.add(100);
            list.add(200);
            list.add(300);
            list.add(400);
            list.add(500);

            list.print();
            System.out.println("Size : " + list.size());
        }
/*

    head → always points to first node
    tail → always points to last node
    New nodes are added using tail.next
    size increases on every add()
    print() traverses from head to null



 */
}