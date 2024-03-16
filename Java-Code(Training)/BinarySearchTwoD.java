public class BinarySearchTwoD 
{
    public static void main(String[] args) 
    {

       int[][] arr = {{1,2,3,4,5},
                      {6,7,8,9,10},
                      {11,12,13,14,15},
                      {16,17,18,19,20},
                      
                     };
    for (int i = 1; i <=30; i++) 
    {
        search(arr,2);
    }     

       }

       private static void search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        int start = 0;
        int end = rows - 1;
        int c = 0;
    
        while (start <= end) {
            c++;
            int midRow = start + (end - start) / 2;
            int midValue = arr[midRow][cols - 1];
    
            if (midValue == target) {
                System.out.println(c);
                System.out.println(target + " is at index [" + midRow + "][" + (cols - 1) + "]");
                return;
            }
    
            if (midValue < target) {
                start = midRow + 1;
            } else {
                
                int left = 0;
                int right = cols - 1;
    
                while (left <= right) {
                    
                    int midCol = left + (right - left) / 2;
                    int value = arr[midRow][midCol];
    
                    if (value == target) {
                        System.out.println(c);
                        System.out.println(target + " is at index [" + midRow + "][" + midCol + "]");
                        return;
                    }
    
                    if (value < target) {
                        left = midCol + 1;
                    } else {
                        right = midCol - 1;
                    }
                }
                end --;
    
                // Target not found in the current row
            }
        }
    
        System.out.println("Target not found");
    }
    
    // //    private static void search(int[][] arr, int target) 
    // {
    //     int rows = arr.length;
    //     int cols = arr[0].length;
    //     int start = 0;
    //     int end = rows * cols - 1;
    //     int c = 0;

    //     while (start <= end) {
    //         c++;
    //         int mid = start + (end - start) / 2;
    //         int row = mid / cols;
    //         int col = mid % cols;
    //         int midValue = arr[row][col];

    //         if (midValue == target) {
    //             System.out.println(c);
    //             System.out.println(target + " is at index [" + row + "][" + col + "]");
    //             return;
    //         }

    //         if (midValue < target) {
    //             start = mid + 1;
    //         } else {
    //             end = mid - 1;
    //         }
    //     }

    //     System.out.println("Target not found");
    // }

    
    
}
/*      // int[][] arr2 = {
                        {1,22,34,46,57,61},
                        {2,33,46,59},
                        {2,44,58,62,76,85},
                        {3,54,60,75,78}
                       };           
        int target = 60;
        System.out.println(arr.length);
       binarydearchtwod(arr,target); 
    }

    private static void binarydearchtwod(int[][] arr, int target) 
    {
        int s = 0;
        int e = arr.length-1;
        int mid = 0;
        
        for (int i = 0; i < arr.length; i++) 
        {
            
         for (int j = 0; j <=e; j++) 
         {

           
            if (target == arr[i][e])
            {
                System.out.println(target+" in the index of ["+i+"]["+j+"]");
                return ;
            }

            if (target < arr[i][e])
            {
               e--;
            }
            if (target > arr[i][e]) 
            {
              break;    
            }

            
         }
            
        }
    }
    private static void binarysearchtwod(int[][] arr, int target) 
    {
        int s = 0;
        
        
        for (int i = 0; i < arr.length; i++) 
        {
            int e = arr[i].length-1;
         while(true) 
         {

           
            if (target == arr[i][e])
            {
                System.out.println(target+" in the index of ["+i+"]["+e+"]");
                return ;
            }

            if (target < arr[i][e])
            {
               e--;
            }
            if (target > arr[i][e]) 
            {
              break;    
            }

            
         }
            
        }
        */

