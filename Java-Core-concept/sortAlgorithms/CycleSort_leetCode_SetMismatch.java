import java.util.ArrayList;

public class CycleSort_leetCode_SetMismatch
{
    public static void main(String[] args) 
    {

        int[] arr = {2,1,4,2,6,5};
        ArrayList<Integer> ans = FindMismatch(arr);
        System.out.println(ans);
    }

    static ArrayList<Integer> FindMismatch(int[] arr) 
    {
        cycleSort(arr);
        ArrayList<Integer> dup = new ArrayList<>();
        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] != i+1)
            {
              dup.add(arr[i]);
              dup.add(i+1);
              i++;
            }
            else
            {
                i++;
            }
        }
        return dup; 
    }

    static void cycleSort(int[] arr) 
    {
        int i = 0;
        while(i < arr.length)
        {
            a:
            if(arr[i] != i+1 && arr[i] < arr.length)
            {
               if(arr[i] == arr[arr[i]-1])
               {
                i++;
                break a;
               }
               Swap(arr,arr[i]-1,i);
            }
            else i++;
        }
    }

    static void Swap(int[] arr, int i, int j) 
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}