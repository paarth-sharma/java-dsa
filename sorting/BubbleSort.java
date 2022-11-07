import java.util.*;
public class BubbleSort{

  static Scanner key = new Scanner(System.in);

  int arr[]=new int [5];
  String str[]=new String[5];
  
  void Num(){  
    System.out.println("Enter elements to sort : ");
    for(int i =0;i<5;i++)
      arr[i] =key.nextInt();
    int temp;
    for(int i=0;i<5;i++){
      for(int j=0;j<5-i-1;j++){
        if(arr[j+1]<arr[j]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    System.out.println("Sorted array: ");
    for(int i : arr)
      System.out.println(arr[i]);
  }
  void Str(){
    System.out.println("Enter names: ");
    for(int i =0;i<5;i++)
      str[i] =key.nextLine();
    String temp;
    for(int i=0;i<5;i++){
      for(int j=0;j<5-i-1;j++){
        if(str[j+1].compareTo(str[j])<0){
          temp = str[j];
          str[j] = str[j+1];
          str[j+1] = temp;
        }
      }
    }  
    System.out.println("Sorted array: ");
    for(int i=0;i<5;i++)
      System.out.println(str[i]);
  }
  public static void main(String[]args){
    System.out.println("To work with Numbers press --> 1");
    System.out.println("To work with Strings press --> 2");
    int c = key.nextInt();
    BubbleSort ob = new BubbleSort();
    switch(c){
      case 1: ob.Num();
              break;
      case 2: ob.Str();
              break;
      default: System.out.println("Wrong Choice!!");
               break;
    }
  }
}
