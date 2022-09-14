import java.util.*;
public class SparceAdd{
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);

        System.out.println("Enter number of rows and columns for array: ");
        int n = key.nextInt();
        int arr[][] = new int [n][n];

        for(int i =0; i<n; i++)
            for(int j =0; j<n; j++)
                 arr[i][j] = key.nextInt();

        int size = 0;

        for(int i=0; i<n ;i++){
            for(int j=0; j<n ;j++){
                if(arr[i][j] != 0)
                    size++;
            }
        }

        if(size > ((n*n)/2)){
            System.out.println("Not a Sparce Matrix. Bye now.");
            System.exit(0);
        }

        else{
            // storing in triplet
            int triplet_mat[][] = new int [size+1][3];

            int k = 1; // start printing elements from second row of triplet array
            triplet_mat[0][0] = n;
            triplet_mat[0][1] = n;
            triplet_mat[0][2] = size;
            
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if (arr[i][j] != 0){
                        triplet_mat[k][0] = i;
                        triplet_mat[k][1] = j;
                        triplet_mat[k][2] = arr[i][j];
                        k++;
                    }
                }
            }
        
        int add[][] = new int[size+1][3];
        for(int i=0; i < (size+1); i++)
            for(int j=0; j<3; j++)
                add[i][j] = i;
        
        // loop to add
        for(int i=0; i < (size+1); i++)
            for(int j=0; j<3; j++)
                triplet_mat[i][j] = triplet_mat[i][j] + add[i][j];

        System.out.println("The final compacted triplet after addition is:");

        for(int i=0 ;i < size+1;i++){
            for(int j=0 ;j < 3;j++)
                System.out.print(triplet_mat[i][j]+" ");    
            System.out.println();
        }
    }

    key.close();
    }
}