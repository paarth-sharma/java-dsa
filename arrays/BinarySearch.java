import java.util.*;
public class BinarySearch{

  static Scanner key = new Scanner(System.in);
  int num[]=new int [5];
  String str[]=new String[5];
  int flag=0,mid=0,lb=0;
  int ub = 4;

  void Num(){
    System.out.println("Enter 5 numbers: ");
    for(int i=0;i<5;i++)
      num[i]=key.nextInt();
    System.out.println("enter number to search: ");
    int n=key.nextInt();
    while(lb<=ub && flag==0){
      mid = (lb+ub)/2;
      if(n>num[mid])
        lb = mid+1 ;
      else if(n<num[mid])
        ub = mid-1 ;
      else
        flag =1 ;
    }
    if(flag ==1)
      System.out.println("Element Found");
    else
      System.out.println("Element not Found");
  }

  void Str(){
    System.out.println("Enter 5 words: ");
    for(int i=0;i<5;i++)
      str[i]=key.nextLine();
    System.out.println("enter word to search: ");
    String s=key.nextLine();
    while(lb<=ub && flag==0){
      mid = (lb+ub)/2;
      if(s.compareTo(str[mid])<0)
        lb = mid+1 ;
      else if(s.compareTo(str[mid])>0)
        ub = mid-1 ;
      else
        flag =1 ;
    }

    if(flag ==1)
      System.out.println("Element Found");
    else
      System.out.println("Element not Found");  
  }
  public static void main(String[]args){
    System.out.println("To work with Numbers press --> 1");
    System.out.println("To work with Strings press --> 2");
    int c = key.nextInt();
    
    BinarySearch ob = new BinarySearch();

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
