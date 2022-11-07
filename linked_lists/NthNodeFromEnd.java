import java.util.*;
public class NthNodeFromEnd {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    int get_node(int index){
        Node current = head;
        int count = 0; // index of current node

        while(current != null){
            if (count == index) 
                return current.data;
            
                count++;
                current = current.next;
        }
        return 0;
    }

    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;   //make new_node the head
        head = new_node;        //move the head to point to new_node
    }
    public static void main(String[] args) {
        NthNodeFromEnd llist = new NthNodeFromEnd();
        
        Scanner key = new Scanner (System.in);

        System.out.println("Enter no. of elements in linked list: ");
        int n = key.nextInt();
        for(int i=0; i<n ;i++){
            int ele = key.nextInt();
            llist.push(ele);
        }

        System.out.println("Enter the element you wanna search for; ");
        int search = key.nextInt();

        System.out.println("Index of searched element is: "+ llist.get_node(search));

        key.close();
    }
}
