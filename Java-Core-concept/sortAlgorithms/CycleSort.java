import java.util.Arrays;

public class CycleSort
  {
   public static void main(String[] args) 
   {
      int arr[] = {5,4,3,2,1,0};
      cycleSort(arr);
      System.out.println(Arrays.toString(arr));
   }
  
  
  static void cycleSort(int[] arr)
    {
        
        int i = 0; 
        while(i < arr.length)
        {
            if(arr[i] < arr.length && arr[i] !=i )
            {
                
                     swap(arr, arr[i], i);
                
            }
            else
            {
                i++;
            }
            
        }
    } 

    static void swap(int[]arr,int i, int j) 
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
  }    