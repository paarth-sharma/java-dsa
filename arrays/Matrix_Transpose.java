import java.util.*;
public class Matrix_Transpose{
  int arr[][] , n;

  static Scanner key = new Scanner(System.in);
 
  Matrix_Transpose(int N){
    n = N;
    arr = new int[N][N];
    System.out.println("Enter "+N*N+" elements");
    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++)
        arr[i][j]=key.nextInt();
    }
  }
  void print(){
      for(int i=0;i<n;i++){
      for(int j=0;j<n;j++)
        System.out.print(arr[i][j]+"\t");
      System.out.println();
    }
  }
  void transpose(){
    for(int i=0;i<n;i++){ // swapping for making transpose
      for(int j=i+1;j<n;j++){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
       }
    }
  }
  public static void main (String[]args){
    System.out.println("Enter no of rows and columns:");
    int N = key.nextInt();
    Matrix_Transpose obj = new Matrix_Transpose(N);
    System.out.println("Before");
    System.out.println("---------------------");
    obj.print();
    System.out.println(" AfterTransposing");
    System.out.println("---------------------");
    obj.transpose();
    obj.print();
    }
}

           
 /*Variable Description Table
   
int n, N - store the number of rows and columns of array
int arr[] - 2d array 
int temp - temporary variable for swapping 
int i and j- loop control variables
 
*/       
                