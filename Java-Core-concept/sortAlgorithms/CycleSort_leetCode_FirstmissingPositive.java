public class CycleSort_leetCode_FirstmissingPositive 
{
    public static void main(String[] args) {
        int[] arr ={1,-1,2,4};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }
 
    static int firstMissingPositive(int[] nums) 
    {
        cycleSort(nums);
        int i = 0;
    
        while(i < nums.length)
        {

            if(nums[i] != i+1)
            {
                return i+1;
            }
            else
            {
                i++;
            }
        }
        return i+1;
    }

    static void cycleSort(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            a:

            if(arr[i] != i+1 && arr[i] <= arr.length)
            {
                if(arr[i] < 1 || arr[i] == arr[arr[i]-1])
                {
                    i++;
                    break a;
                }
                swap(arr,arr[i]-1,i);
            }
            else i++;
        }
    }

   static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }   
}
