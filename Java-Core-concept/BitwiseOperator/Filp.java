package BitwiseOperator;

import java.util.Arrays;

public class Filp {
    public static void main(String[] args) {
               
        int [][] arr = {{1,1,0,1},{1,0,1,1},{1,0,0,1}};
        flipping(arr);
        int [][] arr1 = {{1,1,0,1},{1,0,1,1},{1,0,0,1}};
        filper(arr1);
        System.out.println((arr[0].length)-1);
        for (int i = 0; i < arr.length; i++) {
           System.out.println(Arrays.toString(arr[i]));
           System.out.println(Arrays.toString(arr1[i]));
           System.out.println(" ");
        }
    }
    
    private static void flipping(int[][] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            int count = 0;
          for (int j = ((arr[i].length)-1); j >= ((arr[i].length))/2; j--) 
          {
            System.out.println(Arrays.toString(arr[i])+" "+i);
            int temp  = arr[i][j];
            arr[i][j] = arr[i][count] ^ 1;
            arr[i][count] = temp ^ 1;
            count ++;
            

          }
          System.out.println(Arrays.toString(arr[i])+" "+i);    
        }
    }

    private static void filper(int[][] arr) 
    { 
       for (int[] is : arr) 
       {
          for (int i = 0; i < (arr[0].length +1)/2; i++) 
          {
               int temp = is[i] ^ 1;
               is[i] =  is[arr[0].length - i -1] ^ 1;
               is[arr[0].length - i -1] = temp;
          } 
       }
    }
}
