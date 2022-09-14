class LinkedList_Basics{
    Node head; // head of the list
 
    /* Linked list Node.  This inner class is made static so
       that main() can access it */
    static class Node {
        int data;
        Node next;
 
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d){
            data = d;
            next = null;
        }
    }
}