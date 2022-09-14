import java.util.*;
public class RevArray {
    public static void main(String[]args){
        Scanner key = new Scanner (System.in);

        System.out.println("Enter the number of elements in the array: ");
        int l = key.nextInt();
        int arr[] = new int [l];
        System.out.println("Enter "+l+ " elemnets: ");
        for(int i=0; i<arr.length; i++)
            arr[i] = key.nextInt();

        System.out.println("The array is: ");
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
        
        int temp = 0; // swap variable
        for( int i = 0;i < l ; i++,l--){
            temp = arr[i];
            arr[i] = arr[l-1];
            arr[l-1] = temp;    
        }
        System.out.println("The reversed array is :");
        for(int i=0; i < arr.length; i++)
            System.out.println(arr[i]);
            
        key.close();
    }
}
