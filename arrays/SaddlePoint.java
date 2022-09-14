import java.util.*;
public class SaddlePoint{
  public static void main(String args []){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter no. of columns");
    int c = scan.nextInt();
    System.out.println("Enter no. of rows");
    int r = scan.nextInt();

    int[][]arr = new int[r][c];

    System.out.println("Enter "+(r*c)+" elements");
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        arr[i][j]=scan.nextInt();
    
    System.out.println("The array is: ");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

    int max=0;
    int min=0;
    int l=r;
    int k=0;

    for(int j=0;j<c;j++){
      max  = arr[0][j]; // the rows are 0 so the search is only in columns
      for(int h = 0;h<r;h++){
        if(max<arr[h][j]){
          max=arr[h][j];
          l=h;
          k=j;
        }
      }

      min = arr[l][0]; // the columns are 0 so the search is in rows
      for(int g=0;g<c;g++){
        if(min>arr[l][g])
          arr[l][g]= min ;
      }
      
      System.out.println("The Saddle point of the array is: ");
      if(min==max){
        System.out.println(arr[l][k]);
        break;
      }
      else
        System.out.println("There is no saddle point");
    }
    scan.close();
  }
}