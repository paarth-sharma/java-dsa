import java.util.*;
public class MultiplyList {

    Node head;
    static class Node{
        int data;
        Node right, down;
    }

    // to make linked list and returns the head pointer of linked list
    static Node construct(int arr[][], int i, int j, int m, int n, Node[][] visited){
        if(i> m-1 || j > n-1) //out of bound condition
            return null;
        if(visited[i][j] != null)
            return visited[i][j];

        Node temp = new Node();
        visited[i][j] = temp;
        temp.data = arr[i][j];
        temp.right = construct(arr, i, j+1, m, n, visited);
        temp.down = construct(arr, i+1, j, m, n, visited);
        return temp;
    }
    static void display(Node head) {
    
        Node Rp; // pointer to move right
        Node Dp = head; // pointer to move down
        
        while (Dp != null) { // loop till node->down is not NULL
            
            Rp = Dp; // loop till node->right is not NULL
        
            while (Rp != null) {
                System.out.print(Rp.data + " ");
                Rp = Rp.right;
            }
            System.out.println();
            Dp = Dp.down;
            }
        }

    static void multiply(){

        Scanner key = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns of linked list matrix: ");
        int m = key.nextInt();
        int n = key.nextInt();

        int arr1[][] = new int [m][n];
        System.out.println("Enter "+(m*n)+" elements: ");
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                arr1[i][j] = key.nextInt();
        
        System.out.println("Enter the no. of rows and columns of linked list matrix: ");
        int p = key.nextInt();
        int q = key.nextInt();

        int arr2[][] = new int [p][q];
        System.out.println("Enter "+(p*q)+" elements: ");
        for(int i=0; i<p; i++)
            for(int j=0; j<q; j++)
                arr2[i][j] = key.nextInt();

        Node[][] visited1 = new Node[m][n];
        Node mat1 = construct(arr1, 0, 0, m, n, visited1);
        display(mat1);

        Node[][] visited2 = new Node[p][q];
        Node mat2 = construct(arr2, 0, 0, p, q, visited2);
        display(mat2);

        if(n != p){
            System.out.println("The matrices can`t be multiplied.");
            System.exit(0);
        }
            

        int mul[][] = new int [m][q];
        // Multiply the two matrices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < p; k++)
                    mul [i][j] += arr1[i][k] * arr2[k][j];
            }
        }

        Node mulList [][] = new Node [m][q];
        Node multi = construct(mul, 0, 0, m, q, mulList);
        System.out.println("Multiplication of both matrices: ");
        display(multi);

        key.close();
    }
    public static void main(String[] args) {
          
        multiply();
        
    }   
}
