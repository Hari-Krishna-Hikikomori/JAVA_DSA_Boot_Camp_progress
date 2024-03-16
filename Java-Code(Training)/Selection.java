import java.util.Arrays;

public class Selection 
{
   public static void main(String[] args) 
   {    
    int arr[] = {5,4,3,2,1,5,6,4};
    sort2(arr);
    System.out.println(Arrays.toString(arr));
   }

private static void sort2(int[] arr) 
{
    for (int i = 0; i < arr.length; i++) 
    {
      int last  = arr.length -i-1;
      int MaxIn = GetMaxIn(arr,last);
      swap(arr, last, MaxIn);    
    }
}

private static int GetMaxIn(int[] arr, int last) 
{
    int max = last;
    for (int j = 0; j <= last; j++) 
    {
        if(arr[j]>arr[max])
        {
          max = j;
        }
    }
    return max;
}

private static void sort(int[] arr) 
{
    int last = arr.length;
    for (int i = 0; i < arr.length; i++) 
    {
        last --;
        for (int j = 0; j < arr.length -i-1; j++) 
        {
               if(arr[j]>arr[last])
               {
                swap(arr, j, last); 
               }
        }
    }
}
public static void swap(int[] array, int index1, int index2) 
{
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
}    
}
