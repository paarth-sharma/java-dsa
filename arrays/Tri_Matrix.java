import java.util.*;
public class Tri_Matrix{
  public static void main(String[]args){

    Scanner key = new Scanner (System.in);
    System.out.println("Enter size of n*n array: ");
    int n = key.nextInt();
    int a[][] = new int[n][n];
    System.out.println("input "+n*n+ " numbers");
    for(int i=0; i<n; i++){
      for(int j =0;j<n;j++){
        a[i][j] = key.nextInt();
      }
    }
    
    System.out.println("Original array:");  
    for(int i = 0; i< n; i++){
      for(int j =0;j< n; j++){ 
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    
    System.out.println("OUTPUT: "); 
    System.out.println("UPPER TRIANGLE "); 
    for(int i = 0; i< n; i++){
      for(int j = 0;j < n; j++){  
        if(i > j) // i > j for all elements of the lower triangle of any matrix
          System.out.print(" "+" ");
        else
          System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    
    System.out.println("LOWER TRIANGLE "); 
    for(int i = 0; i< n; i++){
      for(int j = 0;j < n; j++){  
        if(i < j) // i < j for all elements of the upper triangle of any matrix
          System.out.print(" "+" ");
        else
          System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    key.close();
  }
}
