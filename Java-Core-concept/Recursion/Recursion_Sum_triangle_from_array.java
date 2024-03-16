
import java.util.Arrays;

public class Recursion_Sum_triangle_from_array 
{
   public static void main(String args[]) {
    int[] arr = {1,2,3,4,5};
    int[] arr2 = triangle(arr,arr.length-1);
    System.out.println(Arrays.toString(arr2));
    while(arr.length != 1)
    {
        int[] arr1 = new int[arr.length-1] ;
        for (int i = 0; i < arr.length-1; i++) 
        {
           
          arr1 [i] = arr[i] + arr[i+1];    
        }
        arr = arr1;
    }
    System.out.println(Arrays.toString(arr));
   }

  static int[] triangle(int[] arr,int count) {
    if(count == 0)
    {
      return arr;
    }
    return  triangle(arr,count-1);
  } 
}
