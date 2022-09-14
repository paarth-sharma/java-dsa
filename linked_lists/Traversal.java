public class Traversal {

    Node head; // head of the list

    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }// Constructor
    }

    void printList(){
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        
        Traversal llist = new Traversal();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second; // link from first to second node
        second.next = third; // link from second to third node

        llist.printList();

    }
    
}
