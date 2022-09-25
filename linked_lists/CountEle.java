import java.util.*;
public class CountEle {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;   //set-pointer to head
        head = new_node;        //add data to pointer
    }

    int getCountIter(){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    int getCountRec(Node node){
        if(node == null)
            return 0;
        
        return 1+getCountRec(node.next);
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        CountEle llist = new CountEle();
        
        System.out.println("Enter number of elements in the linked list:");
        int n = key.nextInt();
        for(int i=0; i<n ;i++){
            int ele = key.nextInt();
            llist.push(ele);
        }

        System.out.println("Counting iteratively -->");
        System.out.println("Number of elements is: "+llist.getCountIter());

        System.out.println("Counting recursively -->");
        Node start = llist.head;
        System.out.println("Number of elements is: "+llist.getCountRec(start));

        key.close();
    }
}
