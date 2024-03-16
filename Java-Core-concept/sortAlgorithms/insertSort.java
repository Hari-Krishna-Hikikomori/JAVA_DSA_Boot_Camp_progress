public class insertSort {
    public static void main(String[] args) throws Exception {
        int arr[]={3,1,0};
        int arr1[]={1,0};
        int arr2[]={8,6,2,3,5,7,0,1};
        int missingNum = missing(arr);
        System.out.println("missing num is "+missingNum);
        missingNum = missing(arr1);
        System.out.println("missing num is "+missingNum);
        missingNum = missing(arr2);
        System.out.println("missing num is "+missingNum);
        
    }

    static int missing(int arr[])
    {
        cycleSort(arr);
        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] != i)
            {
                break;
            }
            i++;
        }    
        return i;
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

    static void insertsort(int[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            
            for ( int j = i + 1; j > 0; j--) 
            {
               if(arr[j] < arr[j-1] )
               {
                  swap(arr,j,j-1);
               } 
               else
               {
                 
                break;
               }
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
