public class BubbleSort {
    public static void main(String[]args){
    
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    System.out.println("Enter elements to sort : ");
    for(int i =0;i<arr.length;i++)
      System.out.println(arr[i]);
    
    int temp;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<(arr.length)-i-1;j++){
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
}
