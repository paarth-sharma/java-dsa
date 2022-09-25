import java.util.*;
public class GetNthNode {
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
        int count = 0;

        while(current != null){
            if(count == index)
                return current.data;
            
                count++;
                current = current.next;
        }

        return -1;
    }

    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;   //make new_node the head
        head = new_node;        //move the head to point to new_node
    }
    public static void main(String[] args) {
       Scanner key = new Scanner(System.in);
       
       GetNthNode llist = new GetNthNode();

       System.out.println("Enter no. of elements in linked list: ");
       int n = key.nextInt();
       for(int i=0; i<n ;i++){
        int ele = key.nextInt();
        llist.push(ele);
       }

       System.out.println("Enter index at which you want to find the element between 0 and "+(n-1));
       int search = key.nextInt();
       if(llist.get_node(search) == -1)
        System.out.println("Element doesn't exist in list: ");
       else
        System.out.println("Element at index "+search+ "is : "+llist.get_node(search));

       key.close();
    }
}
