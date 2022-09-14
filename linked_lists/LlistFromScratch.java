public class LlistFromScratch {
    
    Node head; // head of the list

    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }// Constructor
    }

    public static void main(String[] args) {

        LlistFromScratch llist = new LlistFromScratch();

        llist.head = new Node(1); 

        Node second = new Node(2); 
        Node third = new Node(3); 

        llist.head.next = second; // link the the first node to the second
        second.next = third; // link the second node to the third

    }
}
