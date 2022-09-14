import java.util.*;
public class ArrayMenu{

    static int size, arr[], pos, num;

    static int[] insert_num(int arr[], int num, int pos){
        int new_arr[] = new int[arr.length + 1];

        for(int i=0; i < (arr.length+1); i++){
            if(i < (pos-1))
                new_arr[i] = arr[i];
            else if (i == pos-1)
                new_arr[i] = num;
            else
                new_arr[i] = arr[i -1];
        }
        return new_arr;
    }

    static int[] remove_num(int arr[], int pos){
        int new_arr[] = new int[arr.length - 1];

        if(arr == null || pos < 0 || pos >= arr.length)
                return arr;

        for(int i =0, k = 0;i < arr.length; i++){
            if (i == pos)
                continue;

            new_arr[k++] = arr[i];     
        }
        return new_arr;
    }

    static int search(int arr[], int num){
        int ub = (arr.length - 1);
        int lb = 0;
        int mid = (lb+ub)/2;

        while(lb <= ub){
            if(arr[mid] < num)
                lb = mid +1;
            else if (arr[mid] == num){
                System.out.println("Elements fount at: " + mid);
                break;
            }
            else 
                lb = mid - 1;

            mid = (lb+ub)/2;
        }
        if (lb > ub)
            System.out.println("Element not found!");

        return mid;
    }

    public static void main(String[]args){

        Scanner key = new Scanner(System.in);
    
    for(int c=0; c<7;c++){    
        System.out.println("Enter choice between 1 and 6");
        System.out.println("1: Create");
        System.out.println("2: Display");
        System.out.println("3: Insert");
        System.out.println("4: Delete");
        System.out.println("5: Search");
        System.out.println("6: Exit");

        int choice = key.nextInt();

    
        switch(choice){

            case 1:
            System.out.println("Enter no of elements in array");
            size = key.nextInt();
            arr = new int[size];

            for(int i=0; i<arr.length; i++)
                arr[i] = key.nextInt();

            break;

            case 2:
            System.out.println("The array is: ");
            for(int i=0; i<arr.length;i++)    
                System.out.println(arr[i]);

            break;

            case 3:
            System.out.println("Select where to insert element:");
            pos = key.nextInt();
            System.out.println("Enter element you want to insert:");
            num = key.nextInt();

            arr = insert_num(arr, num, pos);

            num =0; pos =0;
            break;
            
            case 4:
            System.out.println("Select position of position element to be deleted:");
            pos = key.nextInt();

            arr = remove_num(arr, pos);

            pos =0;
            break;

            case 5:
            System.out.println("Enter element to search: ");
            num = key.nextInt();

            pos = search(arr, num);

            num =0; pos =0;
            break;

            case 6:
            System.exit(0);
            break;
        }

    }
    key.close();
    }
}