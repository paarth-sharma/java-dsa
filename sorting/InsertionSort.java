import java.util.*;
public class InsertionSort {
  
    static Scanner key = new Scanner (System.in);
    int arr[] = new int[5];
    String str[] = new String[5];

    void NumSort(){
        System.out.println("Enter elements to sort : ");
        for(int i : arr)
            arr[i] =key.nextInt();

        for(int i=0; i<arr.length; i++){

            int key = arr[i];
            int j = i -1;

            /*move elements of arr[0,1,2...n-1], that are greater than key
            to a position ahead of their current postion*/
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    void StrSort(){
        for(int i=0; i<str.length; i++){

            String key = str[i];
            int j = i -1;

            /*move elements of arr[0,1,2...n-1], that are greater than key
            to a position ahead of their current postion*/
            while(j >= 0 && (str[j].compareTo(key)>0)){
                str[j+1] = str[j];
                j = j-1;
            }
            str[j+1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        System.out.println("Enter 1 to work with numbers and 2 for strings: ");
        int choice = key.nextInt();
        switch(choice){
            case 1: obj.NumSort();
                    break;
            case 2: obj.StrSort();
                    break;
        }
    }
    
}
