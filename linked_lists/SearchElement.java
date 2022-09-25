import java.util.*;
public class SearchElement {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    boolean iter_search(Node head, int x){
        Node current = head; //initialize current

        while(current != null){
            if(current.data == x)
                return true;
            
            current = current.next;
        }
        return false; //if data doesn`t exist
    }

    boolean recur_search(Node head, int x){
        
        //Base case
        if(head == null)
            return false;

        if(head.data == x)
            return true;

        //recursion for remaining list 
        return recur_search(head.next, x);
    }

    //Inserts new node at front of the list
    void push(int new_data){

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);

        SearchElement llist = new SearchElement();

        System.out.println("Enter no. of elements in linked list: ");
        int n = key.nextInt();
        for(int i=0; i<n;i++){
            int ele = key.nextInt();
            llist.push(ele);
        }

        System.out.println("Enter element you want to search: ");
        int search = key.nextInt();
        if (llist.iter_search(llist.head, search))
            System.out.println("Element "+search+ " found");
        else
            System.out.println("The element doesn't exsist");

        key.close();
    }
}
