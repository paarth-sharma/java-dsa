import java.util.*;
public class DeleteNodes {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){ // constructor
            data = d;
            next = null;
        }
    }
    /* Given a key, deletes the first occurrence of key in
    linked list */
    void deleteNode(int key){
        Node temp = head;
        Node prev = null;

        //If head itself has the key to be deleted
        if(temp != null && temp.data == key){
            head = temp.next; //changes head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
        return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }
}

