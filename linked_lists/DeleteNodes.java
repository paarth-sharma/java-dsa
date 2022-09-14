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
    void deleteNodeKey(int key){
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
        if (temp == null){
            System.out.println("The element doesn`t exist, BYE :/");
            System.exit(0);
        }

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    void deleteNodePos(int position){
        //If list is empty
        if(head == null){
            System.out.println("Nothing left in list :/");
            System.exit(0);
        }

        //Store head node
        Node temp = head;

        //If head is to be removed
        if(position == 0){
            head = temp.next; //change head
            return;
        }

         // Find previous node of the node to be deleted
         for (int i = 0; temp != null && i < position - 1;i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null){
            System.out.println("Index doesn't exist :/");
            System.exit(0);
        }
            
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next; // Unlink the deleted node from list
    }

    /* Inserts a new Node at front of the list. */
    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
  
    /* This function prints contents of linked list starting from the given node */
    void printList(){
         Node tnode = head;
         while (tnode != null){
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        DeleteNodes llist = new DeleteNodes();

        System.out.println("Enter no of elements of linked list: ");
        int n = key.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Enter element"+ (i+1));
            int ele = key.nextInt();
            llist.push(ele);
        }
        
        System.out.println("\nCreated Linked list is:");
        llist.printList();

        System.out.println("Enter the element to be deleted:");
        int del = key.nextInt();
        llist.deleteNodeKey(del); // Delete node with data 'del'

        System.out.println("\nLinked List after deletion of : "+ del);
        llist.printList();

        System.out.println("Enter the position of element to be deleted:");
        int pos = key.nextInt();
        llist.deleteNodeKey(pos); // Delete node at position 'pos'

        System.out.println("Linked List after deletion of element from index: "+ pos);
        llist.printList();
        key.close();
    }
}
