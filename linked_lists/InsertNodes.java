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
    void insertAfter(Node prev_node, int new_data){
        // Check if the given node is null
        if (prev_node == null){
            System.out.println("The previous node can`t be null!");
            return;
        }

        // 2 & 3 Allocate the node and assign the data
        Node insert = new Node(new_data);

        //4 Make the next of 'insert' as next of 'prev_node'
        insert.next = prev_node.next;

        //5 Make next of 'prev_node' as 'insert'
        prev_node.next = insert;
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
}
