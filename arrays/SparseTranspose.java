import java.util.*;
public class SparseTranspose {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);

    System.out.println("Enter no. of rows and columns: ");
    int r = key.nextInt();
    int c = key.nextInt();
    int sparse_mat[][] = new int [r][c];

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            sparse_mat[i][j] = key.nextInt();
        }
    }

    // checking non-zero elements
    int size = 0;

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(sparse_mat[i][j] != 0)
                size++;
        }
    }

    if(size >= ((r*c)/2)){
        System.out.println("Not a Sparce Matrix. Bye now.");
        System.exit(0);
    }

    else{
        // storing in triplet
        int triplet_mat[][] = new int [size+1][3];

        int k = 1; // start printing elements from second row of triplet array
        triplet_mat[0][0] = r;
        triplet_mat[0][1] = c;
        triplet_mat[0][2] = size;
        
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (sparse_mat[i][j] != 0){
                    triplet_mat[k][0] = i;
                    triplet_mat[k][1] = j;
                    triplet_mat[k][2] = sparse_mat[i][j];
                    k++;
                }
            }
        }
      
        for(int i=0;i < r;i++){ // swapping for making transpose
          for(int j=i+1;j < c;j++){
            int temp = triplet_mat[i][j];
            triplet_mat[i][j] = triplet_mat[j][i];
            triplet_mat[j][i] = temp;
          }
        }

        System.out.println("The final compacted triplet after transpose is:");

        for(int i=0 ;i < size+1;i++){
            for(int j=0 ;j < 3;j++)
                System.out.print(triplet_mat[i][j]+" ");    
            System.out.println();
        }
    }
    
    key.close();
  }
}

