public class CycleSort_leetCode_FindAllMissingNUM{
    public static void main(String[] args) throws Exception {
        int arr[]  = {4,3,2,7,8,2,3,1};
        int arr1[] = {1,1};
        //int arr2[] = {8,6,2,3,5,7,0,1};
        int missingNum = missing(arr);
        System.out.println("Total"+missingNum);
        missingNum = missing(arr1);
        System.out.println("Total"+missingNum);
        // missingNum = missing(arr2);
        // System.out.println("Total"+missingNum);
        
    }

    static int missing(int arr[])
    {
        System.out.println("missing Nums are");
        cycleSort(arr);
        int i = 0;
        int total = 0;
        while(i < arr.length)
        {
            if(arr[i] != i)
            {
               System.out.print(i);
               total ++;
            }
            i++;
        }    
        return total;
    }

    static void cycleSort(int[] arr)
    {
        
        int i = 0; 
        while(i < arr.length)
        {
            if(arr[i] < arr.length && arr[i] != i )
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
