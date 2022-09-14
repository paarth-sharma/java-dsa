import java.util.*;
public class DeleteDup {

    static int removedup(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
 
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1];
 
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 
        return j;
    }
    
    public static void main(String[]args){

        Scanner key = new Scanner(System.in);

        int arr[], size;
        System.out.println("Enter the number of elements of array: ");
        size = key.nextInt();
        arr = new int[size];

        System.out.println("Enter "+size+" elements: ");
        for(int i=0;i < arr.length; i++)
            arr[i] = key.nextInt();

        Arrays.sort(arr);

        int length = removedup(arr, arr.length); 
        
        System.out.println("The array without duplicates: ");
        for(int i=0; i <length;i++)
            System.out.print(arr[i]+ " ");

        key.close();
    }

}
