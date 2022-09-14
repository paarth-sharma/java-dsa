import java.util.*;
public class ArrayRotate{
    public static void main(String[]args){

        Scanner key = new Scanner(System.in);
        int size, arr[];
        System.out.println("Enter number of elements in array: ");
        size = key.nextInt();
        arr = new int [size];

        System.out.println("Enter "+ size +" elements: ");
        for(int i=0; i < arr.length; i++)
            arr[i] = key.nextInt();

        System.out.println("Enter by how many elements to shift: ");
        int shift = key.nextInt();

        shift = shift % arr.length;

        if(shift > arr.length)
            System.exit(0);

        int temp[] = new int[shift];

        for(int i = arr.length - shift; i < arr.length ; i++)
            temp[i- arr.length + shift] = arr[i];
        
        for(int i = arr.length - shift -1; i >=0; i--)
            arr[i + shift] = arr[i];

        for(int i=0; i < shift; i++)
            arr[i] = temp[i];
           
        for(int i = 0; i<arr.length; i++)
        System.out.println(arr[i]+" ");


        key.close();

    }

}