import java.util.*;
public class InsertNodes {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // function inserts node at start of list
    void insertFirst(int new_data){
        // 1 & 2: Allocate the Node and assign data
        Node front = new Node(new_data);

        // Make next of the new node 'front' as head
        front.next = head;

        // Move the head to point to the node 'front'
        head = front;
    }

    //function inserts node at specified position
    void insertPosition(int pos, int data) {
        Node new_node = new Node(data);
        new_node.data = data;
        new_node.next = null;

        // Invalid positions
        if(pos < 1)
            System.out.println("Invalid\n");

            // inserting first node
        else if(pos == 1){
            new_node.next = head;
            head = new_node;
        }

        else
        {
            Node temp = head;

            // traverse till the current (pos-1)th node
            while(--pos > 1){
                temp = temp.next;
            }
            new_node.next= temp.next;
            temp.next = new_node;
        }
    }

    //function inserts node at last position
    void insertLast(int new_data){
    // 1. Allocate the Node &
    // 2. Put in the data
    // 3. Set next as null 
    Node back = new Node(new_data);
 
    /* 4. If the Linked List is empty, then make the
    new node as head */
    if (head == null){
        head = new Node(new_data);
        return;
    }
 
    /* 4. This new node is going to be the last node, so
    make next of it as null */
    back.next = null;
 
    /* 5. Else traverse till the last node */
    Node last = head;
    while (last.next != null)
        last = last.next;
 
    /* 6. Change the next of last node */
    last.next = back;
    return;
    }

    void printList(){
        Node tnode = head;
        while (tnode != null){
           System.out.print(tnode.data + " ");
           tnode = tnode.next;
       }
       System.out.println();
   }
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        InsertNodes llist = new InsertNodes();
        
        System.out.println("Enter size of linked list: ");
        int n = key.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("1 to insert node at start of list");
            System.out.println("2 to insert node at any position");
            System.out.println("3 to insert node at end of list");
            int choice = key.nextInt();
            System.out.println("Enter element: ");
            int ele = key.nextInt();

            switch(choice){
                case 1:
                    llist.insertFirst(ele);
                    System.out.println("The list is: ");
                    llist.printList();
                break;

                case 2:
                    System.out.println("What index ?: ");
                    int pos = key.nextInt();
                    llist.insertPosition(pos, ele);
                    System.out.println("The list is: ");
                    llist.printList();
                break;

                case 3:
                    llist.insertLast(ele);
                    System.out.println("The list is: ");
                    llist.printList();

            }
        }
        
        key.close();
    }
}
