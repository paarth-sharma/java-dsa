import java.util.*;
public class SelectionSort{

  static Scanner key = new Scanner(System.in);
  int arr[]=new int [5];
  String str[]=new String[5];
  int min =0;

  void NumSort(){  
    System.out.println("Enter elements to sort : ");
    for(int i=0; i<5; i++)
      arr[i] =key.nextInt();

    int temp;

    for(int i=0;i<5-1;i++){
      min = i;
      for(int j=i+1;j<5;j++){
        if(arr[j]<arr[min])
          min = j;
      }
      temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
    System.out.println("Sorted array: ");
    for(int i=0; i<5; i++)
      System.out.println(arr[i]);
  }
  void StrSort(){
    System.out.println("Enter names: ");
    for(int i=0;i<5;i++)
      str[i] =key.nextLine();
    String temp;
    for(int i=0;i<5-1;i++){
      min = i;
      for(int j=0;j<5;j++){
        if(str[j].compareTo(str[min])<0)
          min = j;
      }
      temp = str[i];
      str[i] = str[min];
      str[min] = temp;
    }  
    System.out.println("Sorted array: ");
    for(int i=0;i<5;i++)
      System.out.println(str[i]);
  } 
  public static void main(String[]args){
    System.out.println("To work with Numbers press --> 1");
    System.out.println("To work with Strings press --> 2");
    int c = key.nextInt();
    SelectionSort ob = new SelectionSort();
    switch(c){
      case 1: ob.NumSort();
              break;
      case 2: ob.StrSort();
              break;
      default: System.out.println("Wrong Choice!!");
               break;
    }
  }
}
